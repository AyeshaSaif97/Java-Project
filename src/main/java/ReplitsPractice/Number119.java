package ReplitsPractice;

public class Number119 {
    /*
    Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    String censorLetter(String word, char letter){
        String replace=word.replace(letter,'*');
        return replace;

    }

    public static void main(String[] args) {
        Number119 obj= new Number119();
        System.out.println(obj.censorLetter("Computer science",'e'));
        System.out.println(obj.censorLetter("Technology",'t'));


    }
    }


