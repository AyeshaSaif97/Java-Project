package review9;

public class Printer {
    void print() {
        System.out.println("Hello");
    }

    void print(String word) {
        System.out.println(word);
    }

    void print(double weight) {
        System.out.println(weight);
    }

    void print(int age) {
        System.out.println(age);
    }


    void print(String word, int num) {
        System.out.println(word + " " + num);
    }

    void print(int num, String word) {
        System.out.println(word + " " + num);
    }

    void print(int... arr) {
        for (int num : arr) {
            System.out.println(num);
        }


        //var args= variable arguements
        /*void print (String ...a){
            System.out.println("pass as many");
        }


         */


    } public static void main(String[] args) {

        //}
        //  public static void main(int[] args) {

        // }
    }
}