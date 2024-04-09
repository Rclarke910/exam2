package examtwo;

public class ShopApp {
    public static boolean isAFit(Customer customer, Cloth cloth){

        boolean fits = false;
        if(customer.getSize() == cloth.getSize()) {
            return true;
        }
        return fits;
    }

    public static double calculateSubTotal(Cloth[] cloth){
        double result = 0;
        for(int i = 0; i < cloth.length; i++){
            result += cloth[i].getPrice();
        }

        return result;

    }

    public void printClassNamesOfPayableEntities(Payable[] payable){

        System.out.println(payable.getClass());
    }
}
