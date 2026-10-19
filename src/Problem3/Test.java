package Problem3;
import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the capacity of the library");
        int capacity=scan.nextInt();
        Library lib=new Library(capacity);
        System.out.println("---Menu----\n");
        StringBuilder sb=new StringBuilder();
        sb.append("1:add\n");
        sb.append("2:display\n").append("3:delete\n").append("4:displayAuthors");
        sb.append("5:documentWithRecordNumber").append("6:Exit");
        String choice =;
        while (!choice.equals("6")){

        }
    }
}
