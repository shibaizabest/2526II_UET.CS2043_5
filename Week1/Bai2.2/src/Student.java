
public class Student {
    private String id;
    private String name;
    private String email;
    private double gpa;

    public Student(){
        this.id = "";
        this.name = "";
        this.email = "";
        this.gpa = 0;
    }

    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.email = "";
        this.gpa = 0;
    }

    public Student(String id, String name, String email, double gpa){
        this.id = id;
        this.name = name;
        this.email = email;
        if (gpa >= 0 && gpa <= 4){
            this.gpa = gpa;
        }
        else{
            this.gpa = 0;
        }
    }

    public void setGpa(double gpa){
        if (gpa >= 0 && gpa <= 4){
            this.gpa = gpa;
        }
    }

    @Override
    public String toString(){
        return "--------------------------------------------" + "\n"
                + "Ten sinh vien: " + this.name + '\n'
                + "id: " + this.id + '\n'
                + "Email: " + this.email +'\n'
                + "GPA: " + this.gpa + "\n"
                + "------------------------------------------" + "\n"
                ;
    }
}
