import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue customerQueue = new LinkedList();
        Stack messageHistory = new Stack();

        customerQueue.add(new Customer("01", "A"));
        customerQueue.add(new Customer("02", "B"));

        //Xu ly A
        messageHistory.add(new Message("01","Xin chao quy khach"));
        messageHistory.add(new Message("02", "Quy khach su dung dich vu gi a"));
        messageHistory.add(new Message("03", "Tam biet quy khach"));

        System.out.println(messageHistory.pop());

        System.out.println("Da xu ly xong khach: " + customerQueue.poll());
        System.out.println("Da xu ly xong khach: " + customerQueue.poll());
    }
}
