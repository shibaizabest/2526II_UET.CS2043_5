public class Main {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        wc.analyze("Hello world. This is a java program. Hello java, hello world.");
        wc.display();
        System.out.println(wc.getMostAppearance());
    }
}

/*
1. Phan tich:

Do phuc tap khi co them 1 phan tu moi (Trung Binh):
    + ArrayList = O(1);
    + HashMap = O(1);
Do phuc tap khi duyet xem co chua:
    + ArrayList = O(n);
    + HashMap = O(1);

Hello world. This is a java program. Hello java, hello world.
 */
