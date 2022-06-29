package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

public class Adress {
    private String streetName;
 private String zipcode;
 private String city;
 private String country;


public Adress(String streetAdress, String zipCode, String city,String country){

     this.streetName = streetName;
     this.zipcode = zipcode;
this.city = city;
this.country = country;

 }
 public String getStreetName(){return streetName;}

public void setStreetName(String streetNameame){this.streetName=streetName;}

public String getzipCode(){return zipcode;}

    }}