package examtwo;

public class Person {
    private String name;

    private Size size;

    public Size getSize() {
        return size;
    }

    public Person(String name, Size size){
        this.name = name;
        this.size = size;

    }

    public void printInfo(){
        System.out.println("Person name = " + name + " Person size = " + size);
    }
}

