/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.NonNull;

/**
 *
 * @author colin
 */
public class Tableau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column(unique=true)
    @NonNull
    private String support;
    
    @Column(unique=true)
    @NonNull
    private int largeur;
              
    @Column(unique=true)
    @NonNull
    private int hauteur;
    
    @ManyToMany(mappedBy = "oeuvres")
    List<Exposition> accrochages = new LinkedList<>();
    
    @OneToOne(mappedBy = "oeuvre")
    private Transaction estVendu;

    @ManyToOne
    private Artiste auteur;

    public Integer getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getSupport() {
        return support;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public List<Exposition> getAccrochages() {
        return accrochages;
    }

    public Transaction getEstVendu() {
        return estVendu;
    }

    public Artiste getAuteur() {
        return auteur;
    }
    
    
    }
