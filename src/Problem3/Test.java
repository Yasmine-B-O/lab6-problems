package Problem3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the capacity of the library: ");
        int capacity = scan.nextInt();
        Library lib = new Library(capacity);

        // Initialisation avec deux documents de votre choix
        System.out.println("Initializing library with 2 documents...");
        lib.add(new Book("Java Programming", "John Doe", 500));
        lib.add(new Magazine("Science Today", "January", 2024));

        StringBuilder sb = new StringBuilder();
        sb.append("\n--- Menu ---\n");
        sb.append("1: Add a document\n");
        sb.append("2: Display documents\n");
        sb.append("3: Delete a document\n");
        sb.append("4: Display authors\n");
        sb.append("5: Find document by record number\n");
        sb.append("6: Exit\n");

        int choice = 0;
        while (choice != 6) {
            System.out.println(sb);
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("What type of document? (1: Book, 2: Magazine, 3: Dictionary)");
                    int type = scan.nextInt();
                    scan.nextLine(); // Consomme le retour à la ligne

                    System.out.print("Enter title: ");
                    String title = scan.nextLine();

                    if (type == 1) {
                        System.out.print("Enter author: ");
                        String author = scan.nextLine();
                        System.out.print("Enter number of pages: ");
                        int pages = scan.nextInt();
                        lib.add(new Book(title, author, pages));
                    } else if (type == 2) {
                        System.out.print("Enter month: ");
                        String month = scan.nextLine();
                        System.out.print("Enter year: ");
                        int year = scan.nextInt();
                        lib.add(new Magazine(title, month, year));
                    } else if (type == 3) {
                        System.out.print("Enter language: ");
                        String lang = scan.nextLine();
                        lib.add(new Dictionary(title, lang));
                    }
                    break;

                case 2:
                    System.out.println("\n--- List of Documents ---");
                    lib.displayDocuments();
                    break;

                case 3:
                    System.out.print("Enter the title of the document to delete: ");
                    String deleteTitle = scan.nextLine();
                    boolean deleted = false;
                    for (Document d : lib.getArr()) {
                        if (d.getTitle().equalsIgnoreCase(deleteTitle)) {
                            lib.delete(d);
                            deleted = true;
                            break;
                        }
                    }
                    System.out.println(deleted ? "Document deleted." : "Document not found.");
                    break;

                case 4:
                    lib.displayAuthors();
                    break;

                case 5:
                    System.out.print("Enter the record number to find: ");
                    int numEnrg = scan.nextInt();
                    Document foundDoc = lib.document(numEnrg);
                    if (foundDoc != null) {
                        System.out.println("Found: " + foundDoc);
                    } else {
                        System.out.println("No document found with this record number.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scan.close();
    }
}