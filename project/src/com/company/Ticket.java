package com.company;

public class Ticket {
    public String pnr;
    public String destinationLocation;
    public String arrivalLocation;
    public String departureDateTime;
    public String arrivalDateTime;
    public String seatNo;
    public float price;
    public boolean cancelled;
    public Flight flight;
    public Passenger passenger;
    public String checkStatus(){
        return "fgfg";
    }
    public int getFlightDuration(){
        return 11;
    }

    public Ticket(String pnr, String destinationLocation, String arrivalLocation, String departureDateTime, String arrivalDateTime, String seatNo, float price,Flight flight) {
        this.pnr = pnr;
        this.destinationLocation = destinationLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.flight=flight;
    }

    public void cancel(){

    }
}
