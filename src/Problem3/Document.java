package Problem3;

public class Document {
    static public int  numRec=0;
    private String title;

    public Document(String title){
        this.title=title;
        numRec++;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Title : ["+title+"]\n";
    }
}
