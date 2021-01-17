/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;
import lombok.NonNull;

/**
 *
 * @author colin
 */
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private Date venduLe;
    
    @Column(unique=true)
    
    private float prixVente;
    
    @ManyToOne
    private Exposition lieuDeVente;
    
    @ManyToOne
    private Personne client;

    @OneToOne
    private Tableau oeuvre;

    public Integer getId() {
        return id;
    }

    public Date getVenduLe() {
        return venduLe;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public Exposition getLieuDeVente() {
        return lieuDeVente;
    }

    public Personne getClient() {
        return client;
    }

    public Tableau getOeuvre() {
        return oeuvre;
    }
    

}
