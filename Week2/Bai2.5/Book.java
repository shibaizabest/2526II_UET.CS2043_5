import java.util.Objects;

public class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Book cmp = (Book) obj;
        return (this.title.equals(cmp.title) && this.author.equals(cmp.author) && (this.price == cmp.price));
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author, price);
    }
}