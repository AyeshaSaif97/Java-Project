package ReplitsPractice;


class Number86 {
        /*
        Create a class 'Main' (please do not make it public as Repl will give you an error)

Inside class declare a String variable 'name' and integer variable 'roll_no'.

Create an object of the class and assign the value of 2 to roll_no and value of "John" to name

Your program should print the following:

```
Name is John and roll number is 2
```
         */

    String name;
    int rollnumber;


    public static void main(String[] args) {
        Number86 student = new Number86();
        student.name = "John";
        student.rollnumber = 2;

        System.out.println("Name is " + student.name + " and roll number is " + student.rollnumber);

    }

}


