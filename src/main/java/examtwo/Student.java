package examtwo;

public class Student extends Customer {

    public long studentID;

    private static int counter = 0;

    public Student(String name, Size size) {
        super(name, size);
        this.studentID = ++counter;

    }

    protected final double DISCOUNT = 0.05;

    public  double getDISCOUNT() {
        return DISCOUNT;
    }

    public void printUniqueStudentID(){
        System.out.println(studentID);
    }


}
