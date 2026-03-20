public class Employee{
    private String name;
    private MyDate birthday;

    public Employee(Employee to_copy){
        this(to_copy.getName(), new MyDate(to_copy.getBirthday()));
    }

    public Employee(String name, MyDate birthday){
        this.name = name;
        this.birthday = new MyDate(birthday);
    }

    public String getName(){
        return this.name;
    }
    public MyDate getBirthday(){
        return new MyDate(this.birthday);
    }

    public void setBirthday(MyDate birthday){
        this.birthday = new MyDate(birthday);
    }
    public void setName(String name){
        this.name = name;
    }
}