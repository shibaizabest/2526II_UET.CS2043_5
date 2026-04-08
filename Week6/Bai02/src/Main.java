public class Main {
    public static void main(String[] args) {
        NotificationApp emailApp = new EmailApp();
        emailApp.notifyUser("Chào bạn, đây là thông báo qua Email!");

        NotificationApp smsApp = new SmsApp();
        smsApp.notifyUser("Chào bạn, mã OTP của bạn là 123456.");
    }
}
