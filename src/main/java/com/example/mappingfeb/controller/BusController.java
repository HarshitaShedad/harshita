package com.example.mappingfeb.controller;

import com.example.mappingfeb.entity.Bus;
import com.example.mappingfeb.repository.BusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    private BusRepository busRepository;

    public BusController(BusRepository busRepository) {
        this.busRepository = busRepository;
    }


    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        Bus busname = busRepository.save(bus);
        return new ResponseEntity<>(busname, HttpStatus.CREATED);
    }
}
