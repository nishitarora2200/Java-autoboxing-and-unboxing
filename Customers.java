package Autoboxing;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double>Transactions = new ArrayList<>();

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }

    public Customers(String name, double initialAmount) {
        this.name = name;
        this.Transactions = new ArrayList<>();
        Transactions.add(initialAmount);
    }

    public String getName() {
        return this.name;
    }
    public void addTransactionAmount(double amount){
        this.Transactions.add(amount);
    }
}
