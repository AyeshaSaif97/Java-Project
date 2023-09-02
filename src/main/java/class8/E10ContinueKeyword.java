package class8;

public class E10ContinueKeyword {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println("Batch 17 is the Greatest of all time");
            if(i%2==0){
                continue; //startover//skip
            }
            System.out.println("I was kidding");

        }

    }
}

