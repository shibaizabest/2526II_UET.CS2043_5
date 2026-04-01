import java.util.*;

public class WordCounter {
    HashMap<String, Integer> hm = new HashMap<>();
    ArrayList<String> st = new ArrayList<>();

    public void analyze(String text){
        StringBuilder tempWord = new StringBuilder();

        for (int i = 0; i < text.length() ; i++ ){

            if (Character.isAlphabetic(text.charAt(i))){
                tempWord.append(Character.toLowerCase(text.charAt(i)));
            }
            else if (!tempWord.isEmpty()){
                st.add(tempWord.toString());
                tempWord = new StringBuilder();
            }
        }

        for (String s : st){
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

    }

    public void display(){
        for (String s : hm.keySet()){
            System.out.println(s + " - " + hm.get(s));
        }
    }

    public String getMostAppearance(){
        String temp = "";
        int time = 0;

        for (String s : hm.keySet()){
            if (time < hm.get(s)){
                temp = s;
                time = hm.get(s);
            }
        }

        return temp;
    }
}
