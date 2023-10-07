package class29;

public class E5Exceptions {
    public static void main(String[] args) {

        System.out.println("1");

        //we can have one try and multiple catch blocks

        try {
            //place the code that might throw an exception
          //  System.out.println(10/0);
            //String name=null;
            //name.length();
            int[] arr=new int[-5];
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }
        catch (NullPointerException e){
            System.out.println("Check if you have store the null value in variable");
        }
  catch (Exception e){
      System.out.println("Something went wrong ");

  }



    }
}