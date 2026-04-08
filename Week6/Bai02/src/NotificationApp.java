abstract public class NotificationApp {
    public void notifyUser(String msg){
        Notification notification = createNotification();

        notification.send(msg);
    }
    abstract Notification createNotification();

}
