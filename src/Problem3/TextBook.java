package Problem3;

public class TextBook extends Book {
    private String level;

    public TextBook(String title,String author,int nbrPages ,String level){
        super(title,author,nbrPages);
        this.level=level;
    }

    public String getLevel(){
        return level;
    }
    @Override
    public String toString(){
        return "Title ["+this.getTitle()+"] ,Author ["+this.getAuthor()+"] ,nbrPages ["+this.getNbrPages()+"] ,Level["+level+"]\n";
    }
}
