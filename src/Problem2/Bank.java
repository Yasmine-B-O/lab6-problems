package Problem2;
import java.util.*;

public class Bank {
    private String name;
    private ArrayList<Customer> arr=new ArrayList<Customer>();

    public Bank(String name){
        this.name=name;
    }


    public void add(Customer customer){
        if(!arr.contains(customer)){
            arr.add(customer);
        }
    }

    public String getName(){
        return name;
    }

    public void addTransaction(Customer customer,Double amount){
        if(arr.contains(customer)){
            customer.add(amount);
        }
    }

    public void print(){
        for(Customer cust:arr){
            System.out.println("The transaction amounts of the customer "+cust.getName()+" are :");
            for(Double amount: cust.getArr()){
                System.out.println("["+amount+"] ");
            }
            System.out.println(" ------------ \n");
        }
    }

}
