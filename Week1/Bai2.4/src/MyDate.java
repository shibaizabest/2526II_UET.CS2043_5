
public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int _day, int _month, int _year){
        day = _day;
        month = _month;
        year = _year;
    }

    public MyDate(MyDate other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    @Override
    public String toString(){
        String days = Integer.toString(day);
        String months = Integer.toString(month);
        String years = Integer.toString(year);
        return days + '/' + months + '/' + years;
    }
}
