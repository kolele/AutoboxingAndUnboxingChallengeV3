package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String customerName, double initialAmount){
        if (customerIsOnFile(customerName)){
            System.out.println("Customer already present. Cannot add it");
        } else {
            System.out.println("Added customer with name " + customerName + "with initial amount of" + initialAmount);
            customers.add(new Customer(customerName,initialAmount));
        }
    }

    public void addTransaction(String customerName,double transactionAmount){
        Customer tempCustomer = returnCustomer(customerName);
        if (customerIsOnFile(customerName)){
            System.out.println("Adding " + transactionAmount + " to customer " + customerName);
            tempCustomer.addTransaction(transactionAmount);
        } else {
            System.out.println("Customer not on file in this branch");
        }
    }

    public Customer returnCustomer(String customerName){
        for (int i=0;i<customers.size();i++){
            if (customers.get(i).getName().matches(customerName)){
                return customers.get(i);
            }
        }return null;
    }

    private boolean customerIsOnFile(String customerName){
        for (int i=0;i<customers.size();i++){
            if (customers.get(i).getName().contains(customerName)){
                return true;
            }
        }return false;
    }


}
