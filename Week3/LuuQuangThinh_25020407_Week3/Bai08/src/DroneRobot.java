public class DroneRobot extends Robot implements GPS, Flyable{

    public DroneRobot(int id, String modelName){
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println(super.getModelName() + "performing main task");
    }

    @Override
    public void fly() {
        System.out.println(super.getModelName() + " flying");
    }

    @Override
    public void getCoordinates(){
        System.out.println(super.getModelName() + " gettingCoordinates");
    };
}
