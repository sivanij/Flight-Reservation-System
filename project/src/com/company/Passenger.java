package com.company;

public class Passenger {
    private int id;
    public Address address;
    public Contact contact;
    private static int idCounter;


    public Passenger(int id, Address address, Contact contact) {
        idCounter++;
        this.id = id+idCounter;
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


    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", address=" + address +
                ", contact=" + contact +
                '}';
    }
    public int getPassengerCount(){
        return idCounter;
    }
}
