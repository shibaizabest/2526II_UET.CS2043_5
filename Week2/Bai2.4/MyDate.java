public class MyDate{
    private int day, month, year;

    public MyDate(MyDate other){
        this.day = other.getDay();
        this.month = other.getMonth();
        this.year = other.getYear();
    }
    public MyDate(int day,int  month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString(){
        return Integer.toString(this.day) + '/' + Integer.toString(this.month) + '/' + Integer.toString(this.year);
    }
}