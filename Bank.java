package Autoboxing;

import java.util.ArrayList;

public class Bank {
    private String branchName;
    private ArrayList<Branch> branches;

    public Bank(String branchName) {
        this.branchName = branchName;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String name){
        Branch b = findBranch(name);
        if(b==null){
            this.branches.add(new Branch(name));
            System.out.println("branch is added to the bank sucessfully");
            return true;
        }
        return false;



    }
    public Branch findBranch(String name){
        System.out.println("findBranch() of bank class is called");
        for(int i=0;i<this.branches.size();i++){
            Branch b = this.branches.get(i);
            if(b.getName().equals(name)){
                System.out.println("branch is found");
                return b;
            }

        }
        return null;
    }

    public boolean addCustomer(String branchName,String customerName,double amount){
        Branch b = findBranch(branchName);
        System.out.println("addCustomer() method of bank is called");
        if(b!=null){
            System.out.println("customer is sucessfully added");
            return b.addNewCustomer(customerName,amount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branch b = findBranch(branchName);
        if(b!=null){
            return b.addCustomerTransaction(customerName,amount);
        }
        return false;
    }
    public boolean listCustomers(String branchName,boolean showTransactions){
        System.out.println("listCustomers() of bank class is called");
        Branch b = findBranch(branchName);
        if(b!=null){
            System.out.println("the list of customers for the branch "+b.getName()+"are");
            ArrayList<Customers>branchCustomersList = b.getCustomer();
            for (int i=0;i<branchCustomersList.size();i++){
                Customers branchCustomer = branchCustomersList.get(i);
                System.out.println("Customer "+(i+1)+" "+branchCustomer.getName());
                if(showTransactions){
                    System.out.println("transactions are :");
                    ArrayList<Double>customerTransaction = branchCustomer.getTransactions();
                    for(int j=0;j<customerTransaction.size();j++){
                        System.out.println("Transaction amount "+(j+1)+" of this customer is "+customerTransaction.get(j));

                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}