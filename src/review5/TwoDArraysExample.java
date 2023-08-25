package review5;

public class TwoDArraysExample {
    public static void main(String[] args) {

        String[][] countries = {
                {"Canada", "USA"}, //0
                {"Ecuador", "Brazil", "Chile"}, //1
                {"Romania", "France", "Italy"}, //2
        };
        System.out.println(countries.length); //3 - number of 1D Arrays

        for (String[] CountryArray : countries) { //outerloop iterates over 1D Arrays
          for(String country:CountryArray){ //inner loop iterates over each element INSIDE that 1D Array
              System.out.print(country+" ");
          }
            System.out.println();

        }

    }

}