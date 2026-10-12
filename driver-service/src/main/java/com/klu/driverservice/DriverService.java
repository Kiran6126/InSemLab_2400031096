package com.klu.driverservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository dr;

    public void insertDriver(Driver d) {
        dr.save(d);
    }

    public List<Driver> getDrivers() {
        return dr.findAll();
    }

    public Driver getDriverById(int id) {
        return dr.findById(id).orElse(null);
    }
}
