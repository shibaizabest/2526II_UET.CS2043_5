import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        al();
        hm();
        tm();
    }
    //ArrayList
    public static void al(){
        // O(N) for query
        ArrayList<Book> b = new ArrayList<>();

        b.add(new Book("01", "Mein Karft", "Adult Healer", 1960));
        b.add(new Book("02", "Minecraft", "Head", 2015));
        b.add(new Book("03", "Mein Karft", "Adult Healer",1960));
        b.add(new Book("04", "Minecraft", "Head",2015));
        b.add(new Book("05", "Mein Karft", "Adult Healer",1960));

        String idToFind = "03";
        for (Book x : b){
            if (x.getId().equals(idToFind)){
                System.out.println(x);
            }
        }

        String idToRemove = "03";
        b.removeIf(x -> x.getId().equals(idToRemove));

        for (Book x : b){
            System.out.println(x);
        }
    }
    //HashMap
    public static void hm(){
        // O(1) for every Query
        HashMap<String, Book> b = new HashMap<>();

        b.put("01", new Book("01", "Mein Karft", "Adult Healer", 1960));
        b.put("02", new Book("02", "Minecraft", "Head", 2015));
        b.put("03", new Book("03", "Mein Karft", "Adult Healer",1960));
        b.put("04", new Book("04", "Minecraft", "Head",2015));
        b.put("05", new Book("05", "Mein Karft", "Adult Healer",1960));

        String idToFind = "03";
        System.out.println(b.get(idToFind));

        String idToRemove = "03";
        b.remove(idToRemove);

        for (String id : b.keySet()){
            System.out.println(b.get(id));
        }
    }
    //TreeMap
    public static void tm(){
        // O(logN) for every Query
        TreeMap<String, Book> b = new TreeMap<>();

        b.put("01", new Book("01", "Mein Karft", "Adult Healer", 1960));
        b.put("02", new Book("02", "Minecraft", "Head", 2015));
        b.put("03", new Book("03", "Mein Karft", "Adult Healer",1960));
        b.put("04", new Book("04", "Minecraft", "Head",2015));
        b.put("05", new Book("05", "Mein Karft", "Adult Healer",1960));

        String idToFind = "03";
        System.out.println(b.get(idToFind));

        String idToRemove = "03";
        b.remove(idToRemove);

        for (String id : b.keySet()){
            System.out.println(b.get(id));
        }
    }
}
/*
Độ phức tạp:
+ ArrayList : O(N)
+ HashMap : O(1)
+ TreeMap : O(logN)

Cấu trúc phù hợp:
+ Số lượng sách nhỏ : ArrayList vì truy cập vẫn tốt (và toosn ít bộ nhớ)
+ Số lượng sách lớn : HashMap vì truy cập nhanh (Trong khi ArrayList rất lâu)
+ Cần sắp xếp theo ID : TreeMap

Vì HashMap băm ra, truy cập trực tiếp vào bằng Key (độc nhất), còn ArrayList chỉ lưu lại trên 1 vùng nhớ nhất định.

 */