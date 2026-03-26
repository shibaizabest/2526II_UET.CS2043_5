public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{
    @Override
    public void swim(){
        System.out.println("Swim");
    }

    @Override
    public void fly(){
        System.out.println("Fly");
    }

//    @Override
//    public void fight() {
//        super.fight();
//    }
}
