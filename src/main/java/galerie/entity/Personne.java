/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.List;
import javax.persistence.*;
import lombok.NonNull;

/**
 *
 * @author colin
 */
public class Personne {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
        
    @Column(unique=true)
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @Column
    @NonNull
    private float budgetAnnee;

    
    @OneToMany(mappedBy = "client")
    private List<Transaction> achats;
    public List<Transaction> getTransactions() {
        return achats;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public float getBudgetAnnee() {
        return budgetAnnee;
    }

    public List<Transaction> getAchats() {
        return achats;
    }
    
    
    
    public float budgetArtiste(int annee){
        this.budgetAnnee = 0;
        achats.forEach(a ->{
           if (a.getVenduLe().getYear() == annee){
               this.budgetAnnee += a.getPrixVente();
           }
        });
        return this.budgetAnnee;
    }
}
