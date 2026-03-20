public class VipRoom {
    private static int pricePerNight =  2000000;
    private int nightToStay;

    public VipRoom(int nightToStay){
        this.nightToStay = nightToStay;
    }
    public int getFinalPrice(){
        return pricePerNight*nightToStay;
    }
}
