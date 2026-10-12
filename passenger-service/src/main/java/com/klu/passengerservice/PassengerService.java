package com.klu.passengerservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository pr;

    public void insertPassenger(Passenger p) {
        pr.save(p);
    }

    public List<Passenger> getPassengers() {
        return pr.findAll();
    }

    public Passenger getPassengerById(int id) {
        return pr.findById(id).orElse(null);
    }
}
