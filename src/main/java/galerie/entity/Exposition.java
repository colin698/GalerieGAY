/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;
import lombok.NonNull;

/**
 *
 * @author colin
 */

@Entity
public class Exposition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private int duree;
    
    private float sommeVentes;
    
    //Les différentes relations
    @ManyToMany
    List<Tableau> oeuvre = new LinkedList<>();
    
    @NonNull
    @ManyToOne
    private Galerie organisateur;
    
    @OneToMany(mappedBy = "lieuDeVente")
    private List<Transaction> lesVentes;
    public List<Transaction> getTransactions() {
        return lesVentes;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public String getIntitule() {
        return intitule;
    }

    public int getDuree() {
        return duree;
    }

    public float getSommeVentes() {
        return sommeVentes;
    }

    public List<Tableau> getOeuvre() {
        return oeuvre;
    }

    public Galerie getOrganisateur() {
        return organisateur;
    }

    public List<Transaction> getLesVentes() {
        return lesVentes;
    }
    
    
     public float CA(Integer id){
        this.sommeVentes = 0;
        lesVentes.forEach((v) -> {
            if(v.getLieuDeVente().id == id)
            this.sommeVentes += v.getPrixVente();
        });
        return this.sommeVentes;
    }
     
    
    }
