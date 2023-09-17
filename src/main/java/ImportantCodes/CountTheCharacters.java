package ImportantCodes;

public class CountTheCharacters {
    /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphabets(abd AZ) characters are there in the String.
         */

    public static void main(String[] args) {

        String comb="ihdfaoiahuhfdiouaefjlk!@#R@#^#%$%&$DlihSJSJDJAPSDOXAD;foiahflae";
        int upperCount=0;
        int lowerCount=0;

        for (int i = 0; i <comb.length() ; i++){
            char c=comb.charAt(i);
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    upperCount++;
                }else{
                    lowerCount++;
                }
            }

        }

        System.out.println("The amount of upper case letter is "+upperCount);
        System.out.println("The amount of upper case letter is "+lowerCount);


        









    }
}
