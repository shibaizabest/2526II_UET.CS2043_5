import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Robot[] robots = new Robot[n];

        for (int i = 0; i < n ; i++) {
            String robotType = sc.next();
            int id = sc.nextInt();
            String modelName = sc.next();
            switch (robotType){
                case "DR":
                    robots[i] = new DroneRobot(id, modelName);
                    break;
                case "FR":
                    robots[i] = new FishRobot(id, modelName);
                    break;
                case "AR":
                    robots[i] = new AmphibiousRobot(id, modelName);
                    break;
            }
        }
        for (int i = 0; i < n; i++ ){
            robots[i].performMainTask();

            if (robots[i] instanceof Flyable f){
                f.fly();
            }

            if (robots[i] instanceof Swimmable s){
                s.swim();
            }

            if (robots[i] instanceof GPS g){
                g.getCoordinates();
            }
        }
        sc.close();
    }
}
