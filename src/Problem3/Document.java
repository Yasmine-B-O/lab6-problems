package Problem3;

public class Document {
    static public int  numRecounter=0;//shared
    private String title;
    private int numRec;//every document has his own

    public Document(String title){
        this.title=title;
        numRecounter++;
        this.numRec=numRecounter;//important
    }
    public int getNumRec(){
        return numRec;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Title : ["+title+"]\n";
    }
}
