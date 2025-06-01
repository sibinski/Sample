public class Book extends Media{
    int pageCount;

    public Book(String title, String creator, int pageCount){
        super(title, creator);
        this.pageCount = pageCount;
    }

    @Override
    public void play(){
        System.out.println("Reading " + "\"" + title + "\"" + " written by " + creator + " with " + pageCount + " pages.");
    }
}
