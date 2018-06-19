package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Raiffeisen");
        bank.addNewBranch("nbgd");
        bank.addBranchCustomer("nbgd","kole",20);
        bank.addBranchCustomer("nbgd","sale",10);
        bank.printBranchCustomers("nbgd",true);
        bank.addNewBranch("lebac");
        bank.addBranchCustomer("lebac","nikola",30);
        bank.printBranchCustomers("lebac", true);

    }
}
