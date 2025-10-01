package task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Arraylist to store the customer information
        ArrayList<Customer> customers = new ArrayList<>();

        //Declaring the Customer objects
        Customer customer1;
        Customer customer2;
        Customer customer3;

        //Initializing the customer objects, and adding the to the arraylist
        customers.add(new Customer("Yao", "Ming", "YaoBasketMing"));
        customers.add(new Customer("Cristiano", "Ronaldo", "The Goat"));
        customers.add(new Customer("Lionel", "Pessi", "Fifa Princess"));

        //Method calling printCustomers()
        printCustomers(customers);



    }

    //Print Customers method to print all the customers
    public static void printCustomers(ArrayList<Customer> customers){
        //For each loop to print out the customer info that are stored inside the arraylist
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }


}
