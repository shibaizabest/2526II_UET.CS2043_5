public class Student{
    private String id;
    private String name;
    private String email;
    private double gpa;


    //Constructor 1
    public Student(){
        this("N/A", "Unknown", "N/A", 0.0);
    }

    //Constructor 2
    public Student(String id, String name){
        this(id, name, "N/A", 0.0);
    }

    //Constructor 3
    public Student(String id, String name, String email, double gpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.gpa = gpa;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public double getGpa(){ return gpa; }
    @Override
    public String toString(){
        return id + " " + name + " " + gpa + "\n";
    }
}