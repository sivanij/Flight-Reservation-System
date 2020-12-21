package com.company;

public class Passenger {
    private int id;
    public Address address;
    public Contact contact;
    private static int idCounter;
    public class Address {
        private String state;
        private String city;
        private String street;

        public Address(String state, String city, String street) {
            this.state = state;
            this.city = city;
            this.street = street;
        }


        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }
    public class Contact {
        private String name;
        private int phoneNumber;
        private String email;
        public  Contact(String name, int phoneNumber, String email){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.email=email;
        }
        public String getName(){
            return name;

        }
        public void setName(String name){
            this.name=name;
        }
        public int getPhoneNumber(){
            return phoneNumber;
        }
        public void setPhoneNumber(int phoneNumber){
            this.phoneNumber=phoneNumber;
        }
        public String getEmail(){
            return email;
        }
        public  void setEmail(String email){
            this.email=email;
        }
        public   String getContactDetails(){

            return this.name+"  "+this.phoneNumber+"  "+this.email;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", email='" + email + '\'' +
                    '}';
        }
    }


    public Passenger(String street,String city,String state,String name, int phoneNumber,String email) {
        idCounter++;
        this.id = idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name, phoneNumber,email);
    }

    public int getId() {
        return id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address.getState()+" "+address.getCity()+" "+address.getStreet();

    }

    public String getContact() {

        return contact.getEmail()+" "+contact.getName()+" "+contact.getPhoneNumber();
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", address=" + address +
                ", contact=" + contact +
                '}';
    }
    public int getPassengerCount(){
        return idCounter;
    }
}
