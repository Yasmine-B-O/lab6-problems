package Problem3;
import java.util.*;

public class Library {
    private int capacity;
    private ArrayList<Document> arr=new ArrayList<Document>();

    public Library(int Capacity){
        this.capacity=Capacity;
    }

    public void displayDocuments(){
        for(Document ele:arr){
             System.out.println(ele.toString());
        }
    }
    public List<Document> getArr(){
        return arr;
    }

    public Boolean add(Document doc){
        if(!arr.contains(doc)){
            arr.add(doc);
            return true;
        }
        return false;
    }

    public Boolean delete(Document doc){
        if(!arr.contains(doc)){
            arr.remove(doc);
        }
        return !arr.contains(doc);
    }
    public Document document(int numEnrg){
        for (Document doc : arr) {
            if (doc.getNumRec() == numEnrg) {
                return doc;
            }
        }
        return null;

    }

    public void displayAuthors(){
        System.out.println(" the list of authors for all works that have an \n" +
                "author:");
        for(Document ele:arr){
            if(ele instanceof Book){
                System.out.println(((Book) ele).getAuthor());
            }
        }
    }
}
