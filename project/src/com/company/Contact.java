package com.company;

public class Contact {
    public String name;
    public int phoneNumber;
    public String email;
    public Contact(String name,int phoneNumber,String email){
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

}
