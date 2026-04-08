import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       useString();
        useStringBuffer();
        contentAnalysis();
    }
    public static void useString(){
        String st = "";
        long timeBefore = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            st += "Hello";
        }
        System.out.println("Runned in: " + (System.currentTimeMillis() - timeBefore));
    }
    public static void useStringBuffer(){
        StringBuffer s = new StringBuffer();
        long timeBefore = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            s.append("Hello");
        }
        System.out.println("Runned in: " + (System.currentTimeMillis() - timeBefore));
    }
    public static void contentAnalysis(){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        int counting = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '?' || s.charAt(i) == '.' || s.charAt(i) == '!'){
                counting += 1;
            }
        }

        int i = 0;
        String wordToFind = "Java";
        String wordToReplace = "Python";

        int index = s.indexOf(wordToFind);

        while (index != -1){
            s.replace(index, index + wordToFind.length(), wordToReplace);
            index = s.indexOf(wordToFind);
        }

//        s.replace(0, 4, "Python");
        System.out.println(counting);
        System.out.println(s.toString());
    }
}
/*
Java is a high-level, general-purpose, memory-safe, object-oriented programming language. It is intended to let programmers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages.
 */