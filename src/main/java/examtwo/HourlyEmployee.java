package examtwo;

public class HourlyEmployee extends Employee {

    private float hoursWorked;

    private double hourlyWage;

    public HourlyEmployee(String name, Size size, float hoursWorked, double hourlyWage ) {
        super(name, size);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {

        if(hourlyWage < 0){
            this.hourlyWage = 0;
        }
        this.hourlyWage = hourlyWage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        if(hoursWorked < 0){
            this.hoursWorked = 0;
        }
        this.hoursWorked = hoursWorked;
    }
}
