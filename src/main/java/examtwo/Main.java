package examtwo;

public class Main {
    public static void main(String[] args){

        Cloth cloth1 = new Cloth("jeans", 100.00, Size.XL);
        Cloth cloth2 = new Cloth("shirt", 25.00, Size.M);
        Cloth cloth3 = new Cloth("jacket", 200.00, Size.L);

        Student student1 = new Student("Rashawn", Size.XL );
        Student student2 = new Student("Clarke", Size.L );
        Manager manager1 = new Manager("John", Size.S, 100000.0);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Jane", Size.M, 80.0f, 20.0);
        Buisness buisness1 = new Buisness("apple", 10, 1000.0);



        Customer[] customerArray = {student1, manager1, hourlyEmployee1};
        Cloth[] clothArray = {cloth1, cloth2, cloth3};

        System.out.println(ShopApp.calculateSubTotal(clothArray));


        student1.printUniqueStudentID();
        student2.printUniqueStudentID();
        student1.printUniqueStudentID();

        student1.printInfo();

        System.out.println(ShopApp.isAFit(student1, cloth1));

        Customer.printPriceAfterDiscount(cloth1, student1.DISCOUNT);
        Customer.printPriceAfterDiscount(cloth1, manager1.DISCOUNT);
        Customer.printPriceAfterDiscount(cloth1, hourlyEmployee1.DISCOUNT);


        buisness1.setProductPrice(-100.0);
        System.out.println(buisness1.calculatePay());

        Employee managerToEmployee = new Employee("Heather", Size.XL);

















    }
}
