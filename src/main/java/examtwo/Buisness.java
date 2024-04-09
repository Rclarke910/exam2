package examtwo;

public class Buisness implements Payable {
    private String name;
    private int productQtysupply;

    private double productPrice;

    public Buisness(String name, int productQtysupply, double productPrice){
        this.name = name;
        this.productQtysupply = productQtysupply;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {

        if(productPrice < 0){
            productPrice = 0;
        }
        this.productPrice = productPrice;
    }

    public void setProductQtysupply(int productQtysupply) {
        if(productQtysupply < 0 ){
            productQtysupply = 0;
        }
        this.productQtysupply = productQtysupply;
    }

    @Override
    public double calculatePay() {

        double result = 0;
        result += productQtysupply * productPrice;
        if (result < 0. ){
            result = 0;
        }


        return result;
    }
}


