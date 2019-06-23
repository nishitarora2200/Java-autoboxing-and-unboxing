package Autoboxing;

public class main {
    public static void main(String[]args){
        Bank b = new Bank("Axis bank");
        b.addBranch("kapurthla road");
        b.addCustomer("kapurthla road","Nishit Arora",5000.00);
        b.addCustomer("kapurthla road","Prakshdeep Chauhan",1000000.00);
        b.addBranch("BMC Chownk");
        b.addCustomer("BMC Chownk","Rajinder rana ",100000);
        b.listCustomers("kapurthla road",true);
        b.listCustomers("BMC Chownk",true);
    }
}
