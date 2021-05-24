package com.restapi.rest.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import models.Country;

import javax.persistence.*;

 @Entity
 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @SuperBuilder
 @Table(name = "Travel")
 public class Travel {
    private Country country;
    private String producer;
    private int price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 }
