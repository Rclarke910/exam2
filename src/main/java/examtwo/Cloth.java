package examtwo;

public class Cloth {
    private String name;
    private double price;
    private Size size;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Cloth(String name, double price, Size size){
        this.name = name;
        this.price = price;
        this.size = size;
    }
}
