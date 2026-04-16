import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger + " " + logger2);

        //2
        Scanner sc = new Scanner(System.in);
        CreateExport createExport;
        if (sc.next().equals("Excel")){
            createExport = new CreateExcelExport();
        }
        else{
            createExport = new CreatePdfExport();
        }
        Export export = createExport.create();
        export.export();

        //3
        OldPlayer oldPlayer = new OldPlayer();
        Player player = new Adapter(oldPlayer);

        //4
        PartFour p1 = new PartFour("01");
        PartFour p2 = p1.clone();
        p2.setId("02");

        System.out.println(p1.getId() + " " + p2.getId());
    }

}
