package class13;

public class E1LocalVariables {
    public static void main(String[] args) {

        String name= "Java";

        if (10>5){
                int age=23;
                //local variable , it can only be accessed within the block of code not outside (downside)
                //they occupy the memory for shortest period of time.As soon as java is done executing that block they are removed from the memory(upside)

            System.out.println(name);
            System.out.println(age);
        }

        System.out.println(name);
    }
}
