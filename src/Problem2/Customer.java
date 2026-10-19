package Problem2;
import java.util.*;

public class Customer {
    private String name;
    ArrayList<Double> arr=new ArrayList<Double>();

    public Customer(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getArr() {
        return arr;
    }

    public void add(Double amount){
        arr.add(amount);
    }


}
