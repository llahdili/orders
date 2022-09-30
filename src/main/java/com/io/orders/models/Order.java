package com.io.orders.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
@Setter
@Getter
// one Order can have one Item or many Items
public class Order {
    @Id
    private Long id;
    private Date dateCreation;
    private String validation;
    private String reference; // reference must be like "ref = BC mm-dd-(++ increment by 1 related to months)
    private String mode;// active ou non(deleted)
    private String status; // encore ou done ou annulé
    private float totale_TTC;
    private float totale_hors_TTC;


}
