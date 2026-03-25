public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        CanSwim cs = (CanSwim) h;
        h.swim();
        CanFight cf = (CanFight) h;
        h.fight();
    }
}
