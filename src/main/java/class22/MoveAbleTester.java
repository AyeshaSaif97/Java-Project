package class22;

public class MoveAbleTester {
    public static void main(String[] args) {

        MoveAble [] arr={new Car(), new Dog()};
        for(MoveAble a:arr){
            a.move();

            Washable[] arr1 = {new Car(), new Dog()};
            for (Washable b : arr1) {
                b.wash();

            }
        }


    }
}
