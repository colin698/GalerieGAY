/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.*;
import javax.persistence.*;
import lombok.NonNull;

/**
 *
 * @author colin
 */
public class Exposition {
    @Column(unique=true)
    @NonNull
    private Date debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private int duree;
    
    @ManyToMany
    List<Tableau> oeuvre = new LinkedList<>();
    }
