package class10;

public class PhoneTester {
    public static void main(String[] args) {


            Phone IphoneObj=new Phone();
            IphoneObj.brand="Iphone";
            IphoneObj.price=1400.45;
            IphoneObj.model="14 Pro Max";
            System.out.println(IphoneObj.brand);
            System.out.println(IphoneObj.price);
            System.out.println(IphoneObj.model);
            IphoneObj.features();
            IphoneObj.features1();
            IphoneObj.features2();

            System.out.println("___________________________________________");
            Phone pixelObj=new Phone();
            pixelObj.brand="Google";
            pixelObj.price=699.0;
            pixelObj.model="Pixel 7";
            System.out.println(pixelObj.brand);
            System.out.println(pixelObj.price);
            System.out.println(pixelObj.model);
            pixelObj.features();
            pixelObj.features1();
            pixelObj.features2();









    }
}