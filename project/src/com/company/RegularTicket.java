package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;
    private Flight flight;
    public RegularTicket(String destinationLocation,String seatNo,float price,String arrivalLocation,String departureDateTime,String arrivalDateTime,String specialServices,Flight flight){
        super(destinationLocation,seatNo, price,arrivalLocation,departureDateTime,arrivalDateTime);
        this.specialServices=specialServices;
        this.flight=flight;
    }
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
