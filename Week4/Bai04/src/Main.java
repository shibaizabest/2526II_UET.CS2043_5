interface IData {
    void show(); // Mặc định là public abstract
}

class DataManager implements IData {
    // Cố tình KHÔNG ghi public
    public void show() {
        System.out.println("Show Data");
    }
}
/*Khong ghi thi chu ky se khac, vi phai interface trong Java mac dinh la public abstract
, ke ca khong ghi gi.
Khi ke thua, khong duoc phep ha thap pham vi truy cap cua phuong thuc do, trong class khong khai
bao gi thi la Default < Public, nen khong the ha duoc.

Khi bien dich bi loi
java: show() in DataManager cannot implement show() in IData
  attempting to assign weaker access privileges; was public
*/
public class Main {
    public static void main(String[] args) {
        DataManager x = new DataManager();
        x.show();
    }
}
