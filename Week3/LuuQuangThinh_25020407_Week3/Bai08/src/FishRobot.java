public class FishRobot extends Robot implements Swimmable{
    public FishRobot(int id, String modelName){
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println(super.getModelName() + "performing main task");
    }
    @Override
    public void swim(){
        System.out.println(super.getModelName() + " swimming");
    }
}
