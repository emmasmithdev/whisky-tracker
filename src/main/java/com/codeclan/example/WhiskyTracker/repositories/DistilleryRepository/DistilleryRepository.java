package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long> {

    List<Whisky> findByWhiskiesYear(int year);

    List<Distillery> findByRegion(String region);


    List<Distillery> findByWhiskiesAge(int age);


}
