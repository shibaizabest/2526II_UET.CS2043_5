import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LibrarySection<Book> b = new LibrarySection<>();
        LibrarySection<DVD> d = new LibrarySection<>();
        while (n-- > 0){
            String mediaType = sc.next();
            String mediaId = sc.next();
            String infor1 = sc.next();
            String infor2 = sc.next();
            int infor3 = sc.nextInt();

            if (mediaType.equals("B")){
                b.add(new Book(mediaId, infor1, infor2, infor3));
            } else if (mediaType.equals("D")) {
                d.add(new DVD(mediaId, infor1, infor2, infor3));
            }
        }
        System.out.println("Khu vuc sach:");
        b.show();

        System.out.println();

        System.out.println("Khu vuc DVD:");
        d.show();
    }
}
