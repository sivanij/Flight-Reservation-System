package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight flight=new Flight("yogya123","yogya",300,250);

        Ticket ticket=new Ticket("123","delhi","hydrabad","12-12-20,8:00AM","12-12-20,10:00AM","A3",2500,flight);
        Contact contact=new Contact("sivani",247468,"sivani@gmail.com");
        Address address=new Address("telangana","hydrabad","kbhb");
        System.out.println(flight.airline);
        System.out.println(flight.capacity);
        System.out.println(flight.flightNumber);
        System.out.println(ticket.destinationLocation);
        System.out.println(contact.email);
        System.out.println(address.city);
        Passenger passenger=new Passenger(1,address,contact);
        System.out.println(passenger.address.city);
        System.out.println(passenger.contact.name);
        System.out.println(ticket.flight.flightNumber);
        System.out.println(contact.getName());




    }
}
