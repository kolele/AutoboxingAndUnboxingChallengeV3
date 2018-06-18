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
        
    }

    public void addBranchCustomerTransaction(String branchName, String customerName, double transactionAmount){

    }

    private boolean branchIsOnFile(String branchName){
        for (int i=0;i<branches.size();i++){
            if (branches.get(i).getName().contains(branchName)){
                return true;
            }
        }return false;
    }
}
