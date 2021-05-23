package com.restapi.rest.controllers;

import com.restapi.rest.exceptions.NotFoundException;
import com.restapi.rest.services.TravelService;
import com.restapi.rest.entities.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/travels")
public class TravelController {
    @Autowired
    private TravelService travelService;

    @GetMapping()
    public List<Travel> getAllTravels() {
        List<Travel> travels = travelService.getAllTravels();

        if (travels.isEmpty()) {
            throw new NotFoundException();
        }

        return travels;
    }

    @GetMapping("/{travelID}")
    public Travel getTravelDetails(@PathVariable Long travelID) {
        if (travelID == null) {
            throw new NotFoundException();
        }

        return travelService.getTravelDetails(travelID);
    }

    @PostMapping("/addTravel")
    public Travel addTravel(@RequestBody Travel travel) {
        return travelService.addTravel(travel);
    }

    @PutMapping("/updateTravel/{travelID}")
    public Travel updateTravel(@PathVariable Long travelID, @RequestBody Travel travel) {
        return travelService.updateTravel(travelID, travel);
    }

    @DeleteMapping("/deleteTravel/{travelID}")
    public Travel deleteTravel(@PathVariable Long travelID) {
        return travelService.deleteTravel(travelID);
    }
}