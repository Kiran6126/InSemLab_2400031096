package com.klu.passengerservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {

    @Autowired
    PassengerService ps;

    @PostMapping({"/insert", "/passengers/insert"})
    public void insertPassenger(@RequestBody Passenger p) {
        ps.insertPassenger(p);
    }

    @GetMapping("/passengers")
    public List<Passenger> getPassengers() {
        return ps.getPassengers();
    }

    @GetMapping("/passengers/{id}")
    public Passenger getPassengerById(@PathVariable int id) {
        return ps.getPassengerById(id);
    }
}
