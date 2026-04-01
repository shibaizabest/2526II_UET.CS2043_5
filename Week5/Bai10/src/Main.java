import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter file path: ");
        File destination = new File((new Scanner(System.in)).nextLine());
        BufferedReader bufferedReader = null;
        Map<String, String> mp = new HashMap<>();

        try{
            bufferedReader = new BufferedReader(new FileReader(destination));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (!line.contains("=")) continue;
                String[] s = line.split("=",2);

                mp.put(s[0].trim(), s[1].trim());

            }

            if (mp.get("username") == null){
                throw new InvalidConfigException("username not found");
            }
            if (mp.get("timeout") == null){
                throw new InvalidConfigException("timeout not found.");
            }

            int timeout = Integer.parseInt(mp.get("timeout"));
            if (timeout <= 0){
                throw new InvalidConfigException("timeout must be bigger than 0.");
            }
            if (mp.get("maxConnections") != null){
                int maxConnections = Integer.parseInt(mp.get("maxConnections"));
                if (maxConnections < 1){
                    throw new InvalidConfigException("maxConnections must be bigger or equal to 1.");
                }
            }
            for (String s : mp.keySet()){
                System.out.println(s + " - " + mp.get(s));
            }
            System.out.println("Config loaded successfully");
        } catch (FileNotFoundException e) {
            System.err.println("Config file not found.");
        } catch (IOException e) {
            System.err.println("I/O error.");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.err.println("Invalid number format.");
        }
        catch (InvalidConfigException e){
            System.err.println("Invalid config: " + e.getMessage());
        }
        finally{
            try{
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("I/O error.");
            }

            System.out.println("Program finished.");
        }

    }
}
/*
Bai10/src/text.txt
 */