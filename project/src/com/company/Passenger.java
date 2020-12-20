package com.company;

public class Passenger {
    public int id;
    public Address address;
    public Contact contact;

    public Passenger(int id, Address address, Contact contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }
}
