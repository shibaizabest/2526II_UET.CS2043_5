public class Main{
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("123xxx", "Nam");
        Student std3 = new Student("123xxx", "Long", "#define ll long long @ gmail.com", 4.5);
        System.out.println(std3);
        std3.setGpa(3.8);
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
    }
}