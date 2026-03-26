import java.util.ArrayList;

public class LibrarySection <T extends MediaItem>{
   private ArrayList<T> arr = new ArrayList<>();

    public void add(T item){
        arr.add(item);
    }
    public void remove(String mediaId){
        arr.removeIf(item -> (item.getMediaId().equals(mediaId)));
    }
    public void show(){
        for (T x: arr){
            System.out.println(x);
        }
    }
}
