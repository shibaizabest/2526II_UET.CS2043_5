import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String tempId = "Start", tempName;
        double tempGpa;
        Scanner sc = new Scanner(System.in);

        String destinationFile = "Bai09/src/StudentsList.dat";
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(destinationFile));
            tempId = sc.next();
            while(!tempId.equals("END")){
                tempName = sc.nextLine();
                tempGpa = sc.nextDouble();

                objectOutputStream.writeObject(new Student(tempId, tempName, tempGpa));
                tempId = sc.next();
            }
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(destinationFile));

            Student obj = null;
            try{
                while(true){
                    obj = (Student) objectInputStream.readObject();
                    System.out.println(obj);
                }
            } catch (EOFException e) {
                System.out.println("Da het file...");
            }

            objectInputStream.close();
        }
        catch (ClassNotFoundException e) {
            System.err.println("Khong tim thay class Student: " + e);
        }
        catch(FileNotFoundException e){
            System.err.println("Khong tim thay file : " + e);
        }
        catch(IOException e){
            System.err.println("Loi doc/ghi : " + e);
        }
    }
}
