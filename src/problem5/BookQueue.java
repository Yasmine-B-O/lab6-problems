package problem5;

import java.util.*;

public class BookQueue {
    private LinkedList<Book> Queue;

    public BookQueue(){
        this.Queue=new LinkedList<>();
    }

    public void enqueue(Book book){
        Queue.addLast(book);
    }

    public Book dequeue(){
        if (!Queue.isEmpty()) {
            return Queue.removeFirst();
        }
        return null;
    }

    public Book peek(){
        if (!Queue.isEmpty()) {
            return Queue.getFirst();
        }
        return null;
    }

    public void display(){
        System.out.println("Queue contents (front to back):");
        for (Book b : Queue) {
            System.out.println("- " + b.toString());
        }
    }

}