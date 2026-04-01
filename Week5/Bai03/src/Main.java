import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        File inputFile = new File("Bai03/src/Text.txt");
        Scanner sc = new Scanner(System.in);
//        try (Scanner sc = new Scanner(inputFile)) {
        StringBuilder result = new StringBuilder();
//
//            while (sc.hasNextLine()) {
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isAlphabetic(c) || c == ' ') {
                result.append(Character.toLowerCase(c));
            }
        }
        result.append("\n");
        System.out.println(result);
//          }

//
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found!");
//        }
        HashMap<String, Integer> hm = new HashMap<>();
        String tempWord = "";

        for (int i = 0; i < result.length(); i++){
            if (Character.isAlphabetic(result.charAt(i))){
                tempWord += (result.charAt(i));
            }
            else if (!tempWord.isEmpty()){
                hm.put(tempWord, hm.getOrDefault(tempWord, 0) + 1);
                tempWord = "";
            }
        }

        String temp = null;
        int times = 0;

        for (String key : hm.keySet()){
            int keyTimes = hm.get(key);
            if (keyTimes > times){
                temp = key;
                times = keyTimes;
            }
            if (keyTimes == 1){
                System.out.println(key);
            }
        }
        System.out.println("Tu xuat hien nhieu nhat: " + temp);
    }
}