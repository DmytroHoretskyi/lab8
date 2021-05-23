package models;

import com.restapi.rest.entities.Travel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

 @EqualsAndHashCode(callSuper = true)
 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @SuperBuilder
 public class SportTravel extends Travel {
     private Sport sport;
     private int ageLimit;
 }
