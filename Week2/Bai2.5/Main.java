public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("Meinkaft", "AdollHealer", 1945);
        Book book2 = new Book("Meinkaft", "AdollHealer", 1945);

        Book book3 = book1;

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1 == book3);
    }
}