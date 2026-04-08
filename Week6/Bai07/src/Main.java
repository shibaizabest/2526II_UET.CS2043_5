public class Main {
    public static void main(String[] args) {

        Notifier multiChannel = new SMSNotifier(
                new FacebookNotifier(
                        new EmailNotifier()));
        multiChannel.send("Hi");
//        notifier.notify();
    }
}
