package com.company;

public class Ticket {
    private String pnr;
    private String destinationLocation;
    private String arrivalLocation;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String destinationLocation, String seatNo, float price, String arrivalLocation, String departureDateTime, String arrivalDateTime) {
     this.destinationLocation=destinationLocation;
     this.seatNo=seatNo;
     this.price=price;
     this.arrivalLocation=arrivalLocation;
     this.departureDateTime=departureDateTime;
     this.arrivalDateTime=arrivalDateTime;


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

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public String checkStatus(){
        return "fgfg";
    }
    public int getFlightDuration(){
        return 11;
    }

    public Ticket(Passenger passenger){
        this.passenger=passenger;
    }

    public void cancel(){

    }
}
