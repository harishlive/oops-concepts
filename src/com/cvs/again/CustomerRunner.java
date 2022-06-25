package com.cvs.again;

import com.cvs.again.Customer;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("line1","Hyder",534007);

        Customer customer = new Customer("ranga", homeAddress);
        System.out.println(customer);

        Address workAddress = new Address("work address","hyde",54007);
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
        
    }
}
