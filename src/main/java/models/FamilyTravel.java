package models;

import lombok.Data;
import lombok.EqualsAndHashCode;

 @EqualsAndHashCode(callSuper = true)
 @Data
 public class FamilyTravel extends Travel {
     private boolean withKids;
     private boolean isKidsZone;
 }
