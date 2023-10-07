package class29;

public class PracticeNested {
    public static void main(String[] args) {
        System.out.println("1");

        try{
            // place the code that might throw an exception
            System.out.println(10/0);
            //int[] arr = new int[-5];

        } catch (ArithmeticException e){

            System.out.println("You can't divide by zero");
            try{
                System.out.println("We will divide by 1");
                System.out.println(10/1);
            } catch (ArithmeticException i){
                System.out.println("Not Yet");
            }

        } catch (NullPointerException e){
            System.out.println("Check if you stored a NULL");
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
