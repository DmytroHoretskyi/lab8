package manager;

import models.Country;
import models.SortOrder;
import models.Travel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TravelManager {
    private List<Travel> travels = new ArrayList<>();

    public void addTravels(List<Travel> travels) {
        this.travels.addAll(travels);
    }

    public void addTravel(Travel travel) {
        this.travels.add(travel);
    }

    public void sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC)
            travels.stream().sorted(Comparator.comparing(Travel::getPrice)).forEach(System.out::println);
        else
            travels.stream().sorted(Comparator.comparing(Travel::getPrice).reversed()).forEach(System.out::println);
    }

    public List<Travel> searchByCountry(Country country) {
        return travels.stream().filter(travel -> travel.getCountry() == country).collect(Collectors.toList());
    }
}
