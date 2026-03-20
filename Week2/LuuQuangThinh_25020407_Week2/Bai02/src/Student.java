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
        this.setGpa(gpa);
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public void setGpa(double gpa){
        if (gpa > 4 || gpa < 0){
            System.out.println("GPA PHAI NAM TRONG KHOANG 0.0 DEN 4.0");
            return;
        }
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return
        "-----Thong tin sinh vien-----\n" +
        "ID: " + this.id + '\n' +
        "NAME: " + this.name + '\n' +
        "EMAIL: " + this.email + '\n' +
        "GPA: " + this.gpa + '\n';
    }
}