import com.restapi.rest.entities.Travel;
import manager.TravelManager;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class LaunchClass {
    public static void main(String[] args) {
        TravelManager travelManager = new TravelManager();

        Travel first = new Travel(Country.UKRAINE, "Mother", 5000, 1L);
        Travel second = Travel.builder()
                .country(Country.EGYPT)
                .price(20)
                .producer("Lviv polytechnic national university")
                .build();

        SportTravel sportTravel = new SportTravel();
        SportTravel climbingTravel = SportTravel.builder()
                .sport(Sport.CLIMBING)
                .ageLimit(18)
                .build();

        List<Travel> travels = new ArrayList<>();
        travels.add(first);
        travels.add(second);
        System.out.println(travels);

        travelManager.addTravels(travels);
        System.out.println(travelManager.searchByCountry(Country.UKRAINE));

        travelManager.sortByPrice(SortOrder.ASC);
        travelManager.sortByPrice(SortOrder.DESC);
    }
}
