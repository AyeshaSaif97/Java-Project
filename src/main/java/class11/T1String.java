package class11;

public class T1String {
    public static void main(String[] args) {


        //Create a string and if the String is not empty perform the following:
        //if the string has an odd number of characters and has 3 or more characters,
        //print the character in the middle of the String.
        //For example String str=hello =>l


        String str="Hello";

        //if(!str.isEmpty()){ not needed because its getting checked in line 16 length >=3
            if(str.length()%2!=0&&str.length()>=3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));

        }



    }
}
