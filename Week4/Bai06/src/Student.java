public class Student implements Comparable<Student>{
    String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Student other){
        return (this.name.compareTo(other.name));
    }

    @Override
    public String toString(){
        return this.name;
    }
}
