package class12;

public class Practice {


        int sumEvenTox(int x){
            int sum=0;

            for (int i = 2 ; i <=x ; i+=2){
                sum += i ;
            }
            return sum;
        }

        public static void main (String [] args){
            Practice obj = new Practice();
            System.out.println(obj.sumEvenTox(5));
            System.out.println(obj.sumEvenTox(8));
        }
    }
