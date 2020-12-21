package com.company;

public abstract class TouristTicket extends Ticket{

    private HotelAddress hotelAddress;
    private String selectedTouristLocations;
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
    public TouristTicket(String destinationLocation,String seatNo,float price,String arrivalLocation,String departureDateTime,String arrivalDateTime,String specialServices,Flight flight){
        super(destinationLocation,seatNo, price,arrivalLocation,departureDateTime,arrivalDateTime);
        this.flight=flight;
    }


    public HotelAddress getHotelAddress() {
        return hotelAddress;
    }

    public String getSelectedTouristLocations() {
        return selectedTouristLocations;
    }
    public void removeTouristLocation(String location){

    }
}
