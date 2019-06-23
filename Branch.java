package Autoboxing;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customers> customer;
    private String name;

    public Branch(String name) {
        this.customer = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Customers> getCustomer() {
        return customer;
    }



    public String getName() {
        return this.name;
    }
    public boolean addNewCustomer(String name,Double initialAmount) {
        if (findCustomer(name) == null) {

            this.customer.add(new Customers(name, initialAmount));
            System.out.println("addNewCustomer of Branch class is called");
            return true;
        } else {
            System.out.println("Customer already exists");
            return false;
        }
    }
   public Customers findCustomer(String CustomerName){
        for(int i=0;i<this.customer.size();i++){
            Customers c = this.customer.get(i);
            if(c.getName().equals(CustomerName)){
                return c;
            }

        }
        return null;
   }
   public boolean addCustomerTransaction(String name,double amount){
        Customers c = findCustomer(name);
        if(c!=null){
            c.addTransactionAmount(amount);
            return true;
        }
        return false;
   }


}
