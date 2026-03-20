public class Person {
    String name, job;

//    public Person(){
//        System.out.println("1. Person is created");
//    }
    public Person(String name){
        this.name = name;
        System.out.println("1. Person with name = " + this.name + " is created");
    }
}
