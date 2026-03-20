public class StandardRoom {
    private static int pricePerNight =  500000;
    private int nightToStay;

    public StandardRoom(int night){
        nightToStay = night;
    }
    public int getFinalPrice(){
        if (nightToStay > 3){
            return (int) ((pricePerNight*nightToStay)*0.95);
        }
        else{
            return pricePerNight*nightToStay;
        }
    }
}
