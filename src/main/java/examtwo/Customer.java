package examtwo;

public class Customer extends Person {

private Cloth[] clothingItems;

    public Customer(String name, Size size){

        super(name,size);
    }

    public static void printPriceAfterDiscount(Cloth cloth, double discount){
        System.out.println(cloth.getPrice() - (cloth.getPrice() * discount));
    }
}
