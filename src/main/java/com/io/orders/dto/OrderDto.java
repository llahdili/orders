package com.io.orders.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class OrderDto {
    private Long id;
    private Date dateCreation;
    private String validation;
    private String reference; // reference must be like "ref = BC mm-dd-(++ increment by 1 related to months)
    private String mode;// active ou non(deleted)
    private String status; // encore ou done ou annulé
    private float totale_TTC;
    private float totale_hors_TTC;

}
