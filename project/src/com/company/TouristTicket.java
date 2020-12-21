package com.company;

public  class TouristTicket extends Ticket{

    private HotelAddress hotelAddress;
    private String[] selectedTouristLocations;
    private Flight flight;
    static class HotelAddress {
        public String hotelName;
        public String hotelStreet;
        public String city;

        public HotelAddress(String hotelName, String hotelStreet, String city) {
            this.hotelName = hotelName;
            this.hotelStreet = hotelStreet;
            this.city = city;
        }
    }

    public TouristTicket(String pnr, String destinationLocation, String arrivalLocation, String departureDateTime, String arrivalDateTime, String seatNo, float price, Flight flight) {
        super(pnr, destinationLocation, arrivalLocation, departureDateTime, arrivalDateTime, seatNo, price, flight);

        this.flight = flight;
    }

    public TouristTicket(String pnr){
        super(pnr);
    }


    public HotelAddress getHotelAddress() {
        return hotelAddress;
    }

    public String[] getSelectedTouristLocations() {
        return selectedTouristLocations;
    }
    public void removeTouristLocation(String location){

    }
}
