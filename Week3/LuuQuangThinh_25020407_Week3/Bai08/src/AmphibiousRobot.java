public class AmphibiousRobot extends Robot implements Flyable, Swimmable, GPS{
    public AmphibiousRobot(int id, String modelName){
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println(super.getModelName() + " performing main task");
    }
    @Override
    public void swim(){
        System.out.println(super.getModelName() + " swimming");
    }

    @Override
    public void fly() {
        System.out.println(super.getModelName() + " flying");
    }

    @Override
    public void getCoordinates() {
        System.out.println(super.getModelName() + " gettingCoordinates");
    }
}
