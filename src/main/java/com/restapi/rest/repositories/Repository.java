package com.restapi.rest.repositories;

import com.restapi.rest.entities.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Travel, Long> {
}
