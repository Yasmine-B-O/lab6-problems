package Problem2;

public class Test {
    public static void main(String[]  args){
        Bank bank=new Bank("bank1");
        Customer cust=new Customer("Yasmine");
        bank.add(cust);
        bank.add(cust);
        bank.addTransaction(cust,Double.valueOf(100));
        bank.print();
    }
}
