package review7;

public class StringOverview {
    public static void main(String[] args) {

        String color = new String();
        color = "Yellow";
        System.out.println(color);
        System.out.println("+++++++++++++++++++++++++++++");

        String day = new String("Thursday");
        System.out.println(day);
        System.out.println("++++++++++++++++++++++++++++++");

        String sentence = "    Today is September 7   ";
        sentence = sentence.trim();  //cuts the spaces in the beginning and in the end
        System.out.println(sentence);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        int size = sentence.length(); //to find out length
        System.out.println(size);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        String[] words = sentence.split(" "); //give us index word
        System.out.println(words[2]);
        System.out.println("+++++++++++++++++++++++++++++++++");

        String modifiedNewString=sentence.replace("Today","Tomorrow");// replace today with tomorrow
        System.out.println(modifiedNewString);
        System.out.println("+++++++++++++++++++++++++++++++++");

        String str1="Hi Hi Friends";
        str1=str1.replace("Hi","Hello"); //replacing All Hi with Hello
        System.out.println(str1);
        System.out.println("+++++++++++++++++++++++++++++++");

        str1=str1.replaceFirst("Hello","Bye");
        System.out.println(str1);
        System.out.println("+++++++++++++++++++++++++++++++++");

        char letter= str1.charAt(2);
        System.out.println(letter);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        int indexOfCharB=str1.indexOf('F');
        System.out.println(indexOfCharB);
        System.out.println("++++++++++++++++++++++++++++++++++");



    }
}
