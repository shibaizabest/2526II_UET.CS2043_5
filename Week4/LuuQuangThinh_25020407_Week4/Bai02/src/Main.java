public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        CanSwim cs = (CanSwim) h;
        h.swim();
        CanFight cf = (CanFight) h;
        h.fight();
    }
    //Khong can ep lai ve Hero, vi no da so huu 1 ham Fight tu ActionChar, thoa man cho cai Interface CanFight
}
