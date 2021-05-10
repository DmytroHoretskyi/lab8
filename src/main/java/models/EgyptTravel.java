package models;

import lombok.Data;
import lombok.EqualsAndHashCode;

 @EqualsAndHashCode(callSuper = true)
 @Data
 public class EgyptTravel extends FamilyTravel {
     private boolean isVisa;
     private Cities cities;
 }
