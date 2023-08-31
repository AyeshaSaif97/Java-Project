package class12;

public class HomeWork4 {
   /* Create a method that will say Hello in different language based on the country
   that will passed when method is executed
*/
String differentLanguage (String Country){


    if (Country.equals("Canada")){
        return "Hello";
    }else if (Country.equals("Egypt")){
        return "Marhaba";
    }else if (Country.equals("France")){
        return "Bonjour";
    } else if (Country.equals("Spain")) {
        return "Hola";
    }else if (Country.equals("Italy")) {
        return "Ciao";
    }else{
        return "Wrong input";
    }


}



}
