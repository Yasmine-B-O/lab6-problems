package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
//          *** create a new item and add it to the cart
            Item ele=new Item(itemName,itemPrice,quantity);
            cart.add(ele);
            scan.nextLine();
            double totalPrice=0;
            // *** print the contents of the cart object using println
            for(Item element :cart){
                System.out.println("The cart contains the following items :\n");
                System.out.println(element.getName()+"\n");
               totalPrice+=element.getPrice()*element.getQuantity();
            }
            System.out.println("The total Price is : "+totalPrice+" MAD");
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
