package class18;


class GrandPa{
    String color="White";
}
public class Furniture extends GrandPa {
    String color="Black";

}

class Chair extends Furniture{
    String color="Brown";
    void printColor(){
        String color="Blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

class FurnituteTester{
    public static void main(String[] args) {
        Chair c1= new Chair();
        c1.printColor();
    }
}