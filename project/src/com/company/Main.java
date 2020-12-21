package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Contact contact=new Contact("sivani",247468,"sivani@gmail.com");
        Address address=new Address("telangana","hydrabad","kbhb");
        Passenger passenger=new Passenger(1,address,contact);
        System.out.println("passenger:"+passenger.address.getStreet());
        Flight flight=new Flight("Abc123","jet",300,250);

        Ticket ticket=new Ticket("123","delhi","hydrabad","12-12-20,8:00AM","12-12-20,10:00AM","A3",2500,flight);
        Ticket ticket1=new Ticket(passenger);
        System.out.println("ticket1:   "+ticket1.getPassenger().address.getCity());
        System.out.println(ticket.getDestinationLocation());
        System.out.println(address.getCity());
        //accessing private attributes in contact class
        System.out.println(contact.getEmail());
        System.out.println();
        System.out.println(passenger.address.getCity());
        System.out.println(passenger.contact.getPhoneNumber());
        //accesing flightobject inside the ticket
        System.out.println(ticket.getFlight().getFlightNumber());

        //able to access the private attributes
        System.out.println(flight.getAirline());
        System.out.println(flight.getCapacity());
        System.out.println(flight.getFlightNumber());

        //getting passenger count
        System.out.println(passenger.getPassengerCount());



    }
}
