package com.klu.driverservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Driver {

    @Id
    int id;
    String name;
    String phone;
    String vehicleNumber;
    String status;

    public Driver() {
        super();
    }

    public Driver(int id, String name, String phone, String vehicleNumber, String status) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.vehicleNumber = vehicleNumber;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Driver [id=" + id + ", name=" + name + ", phone=" + phone + ", vehicleNumber=" + vehicleNumber
                + ", status=" + status + "]";
    }
}
