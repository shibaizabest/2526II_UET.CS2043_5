
public class Employee {
    private String name;
    private MyDate birthday;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthday(MyDate birthday){
        this.birthday = birthday;
    }
    public MyDate getBirthday(){
        return this.birthday;
    }

    public Employee(Employee toCopy){
        this.name = toCopy.getName();
        this.birthday = new MyDate(toCopy.getBirthday());
    }

    public Employee(){

    }

}
