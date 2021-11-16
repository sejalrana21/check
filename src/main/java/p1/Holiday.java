package p1;

public class Holiday
{
    String holidayname;
    String holidaydate;

    public String getHolidayname() {
        return holidayname;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname;
    }

    public String getHolidaydate() {
        return holidaydate;
    }

    public void setHolidaydate(String holidaydate) {
        this.holidaydate = holidaydate;
    }

    public Holiday(String holidayname, String holidaydate) {
        this.holidayname = holidayname;
        this.holidaydate = holidaydate;
    }

    public Holiday() {
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "holidayname='" + holidayname + '\'' +
                ", holidaydate='" + holidaydate + '\'' +
                '}';
    }

    public void display()
    {
        System.out.println("welcome to spring boot app");
    }
}
