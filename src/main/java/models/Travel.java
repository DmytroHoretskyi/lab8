package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @SuperBuilder
 public class Travel {
    private Country country;
    private String producer;
    private int price;
 }
