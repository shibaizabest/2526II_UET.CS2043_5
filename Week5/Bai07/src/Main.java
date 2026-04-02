import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String inputFile = sc.nextLine();
        String outputFile = sc.nextLine();

        int linesReaded = 0;

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;


        try {
            FileReader fileReader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(outputFile);
            printWriter = new PrintWriter(fileWriter);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
                linesReaded++;
            }

            System.out.println("Thanh cong Copy. So dong: " + linesReaded);
        } catch (FileNotFoundException e) {
            System.err.println("Source file not found.");
        } catch (IOException e) {
            System.err.println("I/O error.");
            System.err.println(e.getMessage());
        } finally {
            if (printWriter!= null){
                printWriter.close();
            }
            try{
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("I/O error.");
                System.err.println(e.getMessage());
            }
        }
    }
}
/*
Bai07/src/InputFile.txt
Bai07/src/OutputFile.txt
 */