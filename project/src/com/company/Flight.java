package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeat;
    private Ticket ticket;

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }
    public Flight(String flightNumber,String airline,int capacity,int bookedSeat){
        this.airline=airline;
        this.bookedSeat=bookedSeat;
        this.capacity=capacity;
        this.flightNumber=flightNumber;


    }
    public boolean checkAvailabulity(){

        return true;

    }
    public void incrementBookingCounter(){

    }
}
