public class Book extends MediaItem{
    private int pages;
    private String author;

    public Book(String id, String name, String author, int pages){
        super(id, name);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString(){
        return (getMediaName() + " - " + author + " - " + pages);
    }
}
