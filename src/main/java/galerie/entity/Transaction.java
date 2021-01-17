/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.Date;
import javax.persistence.Column;
import lombok.NonNull;

/**
 *
 * @author colin
 */
public class Transaction {
    @Column(unique=true)
    @NonNull
    private Date venduLe;
    
    @Column(unique=true)
    @NonNull
    private float prixVente;
}
