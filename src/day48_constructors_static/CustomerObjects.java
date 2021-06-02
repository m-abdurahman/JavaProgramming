package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CustomerObjects {
    public static void main(String[] args){

    Customer cs1 = new Customer();
        System.out.println(cs1); //prints with default value
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

    Customer cs2 = new Customer("Mike", 2); //create objects and assign values to same statement
    Customer cs3 = new Customer("John Ward", 4873);
        System.out.println(cs2);
        System.out.println(cs3);


    //array for Customers
    Customer[] todaysCustomer = {cs1, cs2, cs3, new Customer("Bashir", 449)};

    //arrayList of Customer objects
    List<Customer> customersList = new ArrayList<>();
    customersList.add(cs1);
    customersList.add(cs2);
    customersList.add(cs3);
    customersList.add(new Customer("Bashir", 449));
    customersList.add(new Customer("Suleyman",9763));

    //print info of first customer object in array and arrayList
        System.out.println(todaysCustomer[0].toString());
        System.out.println(customersList.get(0).toString());
        System.out.println(customersList);

        System.out.println("----FOR LOOP-----");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }
        System.out.println("-----FOR EACH LOOP------");
            for (Customer eachCustomer: customersList) {
                System.out.println(eachCustomer);
            }

            //print only names of customers in the list
        System.out.println("-----NAMES OF CUSTOMERS-----");

            //lamda expression '->'
            customersList.forEach(each -> System.out.println(each.getName()));
            for (Customer eachCustomer : customersList){
                System.out.println(eachCustomer.getName());
            }

        }


}

