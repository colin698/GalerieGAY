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
public class Artiste extends Personne{
    @Column(unique=true)
    @NonNull
    private String biographiee;
    
    @OneToMany(mappedBy = "auteur")
    private List<Tableau> lesOeuvres;
    public List<Tableau> getTableaux() {
        return lesOeuvres;
}

    public String getBiographiee() {
        return biographiee;
    }

    public List<Tableau> getLesOeuvres() {
        return lesOeuvres;
    }

}
