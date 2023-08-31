package class12;



public class HomeWork1 {
    /*
    Write a method to return whether given number is prime or not?
     */
    String primeNumber(int num1) {

        if (num1 <= 1) {
            return num1 + " is not a prime number";
        }
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    return num1 + " is not a prime number";
                }
            }
            return num1 + " is a prime number";
        }

    }







