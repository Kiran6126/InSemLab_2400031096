package com.klu.driverservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Autowired
    DriverService ds;

    @PostMapping({"/insert", "/drivers/insert"})
    public void insertDriver(@RequestBody Driver d) {
        ds.insertDriver(d);
    }

    @GetMapping("/drivers")
    public List<Driver> getDrivers() {
        return ds.getDrivers();
    }

    @GetMapping("/drivers/{id}")
    public Driver getDriverById(@PathVariable int id) {
        return ds.getDriverById(id);
    }
}
