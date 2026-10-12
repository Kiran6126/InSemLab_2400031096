package com.klu.passengerservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger {

    @Id
    int id;
    String name;
    String email;
    String source;
    String destination;

    public Passenger() {
        super();
    }

    public Passenger(int id, String name, String email, String source, String destination) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.source = source;
        this.destination = destination;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Passenger [id=" + id + ", name=" + name + ", email=" + email + ", source=" + source
                + ", destination=" + destination + "]";
    }
}
