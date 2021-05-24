package com.restapi.rest.services;

import com.restapi.rest.exceptions.NotFoundException;

import com.restapi.rest.repositories.Repository;
import lombok.RequiredArgsConstructor;
import com.restapi.rest.entities.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TravelService {
    @Autowired
    private Repository repository;

    public List<Travel> getAllTravels() {
        return repository.findAll();
    }

    public Travel getTravelDetails(Long travelID) {
        if (!repository.existsById(travelID)) {
            throw new NotFoundException();
        }

        return repository.findById(travelID).get();
    }

    public Travel addTravel(Travel travel) {
        repository.save(travel);
        return travel;
    }

    public Travel updateTravel(Long travelID, Travel travel) {
        Travel travelPast = repository.findById(travelID).get();

        if (!repository.existsById(travelID)) {
            throw new NotFoundException();
        }

        travel.setId(travelID);
        repository.save(travel);
        return travelPast;
    }

    public Travel deleteTravel(Long travelID) {
        Travel tempTravel = repository.findById(travelID).get();
        repository.deleteById(travelID);
        return tempTravel;
    }
}