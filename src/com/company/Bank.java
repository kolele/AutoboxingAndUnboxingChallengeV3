package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addNewBranch(String branchName){
        if (branchIsOnFile(branchName)){
            System.out.println("Cannot add branch with branch name " + branchName + " as it is already present");
        } else {
            branches.add(new Branch(branchName));
        }
    }

    public void addBranchCustomer(String branchName, String customerName, double initialAmount){
        if (branchIsOnFile(branchName)){
            Branch branch = returnBranch(branchName);
            branch.addCustomer(customerName,initialAmount);
            System.out.println("Added customer with name " + customerName + "to " + branchName + " branch.");
        }
        else System.out.println("No such branch");
    }

    public void addBranchCustomerTransaction(String branchName, String customerName, double transactionAmount){
        if (branchIsOnFile(branchName)){
            Branch branch = returnBranch(branchName);
            branch.addTransaction(customerName,transactionAmount);
        }else {
            System.out.println("No such branch");
        }
    }

    public void printBranchCustomers(String branchName, boolean printTransactions){
        Branch branch = returnBranch(branchName);
        if (branchIsOnFile(branchName)){
            branch.printCustomers();
        } if (printTransactions){
            branch.printTransctions();
        }
    }

    public Branch returnBranch(String branchName){
        for (int i=0;i<branches.size();i++){
            if (branches.get(i).getName().contains(branchName)){
                return branches.get(i);
            }
        }return null;
    }

    private boolean branchIsOnFile(String branchName){
        for (int i=0;i<branches.size();i++){
            if (branches.get(i).getName().contains(branchName)){
                return true;
            }
        }return false;
    }
}
