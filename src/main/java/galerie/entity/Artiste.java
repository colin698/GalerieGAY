/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import javax.persistence.Column;
import lombok.NonNull;

/**
 *
 * @author colin
 */
public class Artiste extends Personne{
    @Column(unique=true)
    @NonNull
    private String biographiee;
}
