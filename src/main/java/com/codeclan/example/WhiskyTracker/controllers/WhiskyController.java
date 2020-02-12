package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired

    private WhiskyRepository whiskyRepository;

//    @GetMapping(value = "/whiskies")
//    public ResponseEntity<List<Whisky>> getAllWhiskies(){
//        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
//    }

//    @GetMapping(value = "/whiskies")
//    public ResponseEntity<List<Whisky>> findAllWhiskiesForAYear(
//            @RequestParam(name="year") int year){
//        return new ResponseEntity<>(whiskyRepository.findByYear(year), HttpStatus.OK);
//    }

//    @GetMapping(value = "/whiskies")
////    public ResponseEntity<List<Whisky>> findWhiskiesFromCertainDistilleryByAge(
////            @RequestParam(name="distillery") String distillery, @RequestParam(name="age") int age){
////        return new ResponseEntity<>(whiskyRepository.findByDistilleryNameAndAge(distillery, age), HttpStatus.OK);
////    }

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> findAllWhiskiesFromRegion(
            @RequestParam(name="region") String region){
        return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(region), HttpStatus.OK);
    }

}
