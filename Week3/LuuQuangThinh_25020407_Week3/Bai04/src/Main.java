public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.makeSound();
        }
        else{
            System.out.println("Day khong phai meow!");
        }
    }
}
/*
a. Chuong trinh bi loi bien dich, loi o Downcasting
Exception in thread "main" java.lang.ClassCastException: class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app')
	at Main.main(Main.java:4)


 */