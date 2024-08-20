package com.example.mappingfeb.controller;


import com.example.mappingfeb.entity.Stop;
import com.example.mappingfeb.repository.StopRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stop")
public class StopController {

    private final StopRepository stopRepository;

    public StopController(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }


    @PostMapping
    public ResponseEntity<Stop> createBus(@RequestBody Stop stop) {
        Stop stopname = stopRepository.save(stop);
        return new ResponseEntity<>(stopname, HttpStatus.CREATED);
    }

}
