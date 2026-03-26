import java.util.ArrayList;

public class Warehouse <T extends Product>{
    ArrayList<T> storage = new ArrayList<>();

    public void nhapKho(T product){
       storage.add(product);
    }

    public void xuatKho(String id){
        storage.removeIf(item -> item.getId().equals(id));
    }

    public void kiemKe(){
        for (Product x : storage){
            System.out.println(x);
        }
    }
}
