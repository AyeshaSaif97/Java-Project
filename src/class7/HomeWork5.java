package class7;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
         */

        String[] animals = {"Dog", "Cat", "Lion", "Elephant", "Panda"};

        int i = 0;
        while (i < animals.length) {
            System.out.println(animals[i]);


            i++;
        }
        System.out.println();
        String[] animalss = {"Dog", "Cat", "Lion", "Elephant", "Panda"};

        for (int j = 0; j < animalss.length; j++) {
            System.out.println(animalss[j]);
        }
    }
}