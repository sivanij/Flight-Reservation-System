package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;
    private Flight flight;

    public RegularTicket(String pnr, String destinationLocation, String arrivalLocation, String departureDateTime, String arrivalDateTime, String seatNo, float price, Flight flight, String specialServices) {
        super(pnr, destinationLocation, arrivalLocation, departureDateTime, arrivalDateTime, seatNo, price, flight);
        this.specialServices = specialServices;
        this.flight = flight;
    }

    public  RegularTicket(String pnr){
        super(pnr);
    }
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
