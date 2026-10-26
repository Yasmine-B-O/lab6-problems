package problem5;

public class Test {
    public static void main(String[] args){
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 2008);

        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();

        stack.push(b1);
        stack.push(b2);
        stack.push(b3);

        stack.display();
        Book poppedBook = stack.pop();
        System.out.println("Popped: " + poppedBook.toString());

        Book topBook = stack.peek();
        System.out.println("Top: " + topBook.toString());

        // Affichage final (il reste 1984 et Hobbit)
        stack.display();

        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();

        queue.enqueue(b1);
        queue.enqueue(b2);
        queue.enqueue(b3);

        // Affichage (Hobbit doit être devant)
        queue.display();

        Book dequeuedBook = queue.dequeue();
        System.out.println("Dequeued: " + dequeuedBook.toString());

        Book frontBook = queue.peek();
        System.out.println("Front: " + frontBook.toString());

        // Affichage final (il reste 1984 et Clean Code)
        queue.display();






    }
}
