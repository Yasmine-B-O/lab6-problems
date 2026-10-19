package Problem3;

public class Novel extends Book{
    private double price;

    public Novel(String title,String author,int nbrPages){
        super(title,author,nbrPages);
        this.price=price;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "Title ["+this.getTitle()+"] ,Author ["+this.getAuthor()+"] ,nbrPages ["+this.getNbrPages()+"] ,Price ["+price+"]\n";
    }
}
