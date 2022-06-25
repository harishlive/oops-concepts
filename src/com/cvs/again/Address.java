package com.cvs.again;

public class Address {
    // state
    private String line1;
    private String city;
    private int zip;

    // creating


    public Address(String line1, String city, int zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return String.format(" line - %s city - %s zip -%d", line1, city, zip);

    }
}
