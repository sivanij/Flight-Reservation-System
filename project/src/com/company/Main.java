package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passenger=new Passenger("kphb","Hydrabad","karnataka","sivani",867543221,"sivani@gmail.com");
        System.out.println("passenger:"+passenger.address.getStreet());
        Flight flight=new Flight("Abc123","jet",300,250);

        Ticket ticket=new Ticket("123","delhi","hydrabad","12-12-20,8:00AM","12-12-20,10:00AM","A3",2500,flight);
        Ticket ticket1=new Ticket(passenger);
        System.out.println("ticket1:   "+ticket1.getPassenger().address.getCity());
        System.out.println(ticket.getDestinationLocation());
        System.out.println();
        //accessing private attributes in contact class
        System.out.println(passenger.address.getCity());
        System.out.println(passenger.contact.getPhoneNumber());
        System.out.println(passenger.getAddress());
        //accesing flightobject inside the ticket
        System.out.println(ticket.getFlight().getFlightNumber());

        //able to access the private attributes
        System.out.println(flight.getAirline());
        System.out.println(flight.getCapacity());
        System.out.println(flight.getFlightNumber());

        //getting passenger count
        System.out.println(passenger.getPassengerCount());
        RegularTicket regularTicket=new RegularTicket("reg-123","delhi","hydrabad","12/12/20","13/12/20","1b",2222,
                flight,"food");
        String hotelAddress="sitara,ring road,hydrabad";
        String[] selectedTouristLocations={"shimla,manali"};
        TouristTicket touristTicket=new TouristTicket("tt-123","delhi","hydrabad","12/12/20","13/12/20","1b",2222,
                flight);
        //accessing pnr numbers
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket){

        System.out.println("pnrnumber:  "+ticket.getPnr());
    }
}
