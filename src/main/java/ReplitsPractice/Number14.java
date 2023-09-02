package ReplitsPractice;

public class Number14 {
    public static void main(String[] args) {
        /*
        **For you to do**

- Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
- Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
- Print the following statement:

```
**_______ modded by _______ is ______**
result2           result1    blank3
```
where blank3 is the remainder of result1 into result2
         */
        int num1=50;
        int num2=100;
        int num3=200;
        int num4=300;
        int num5=400;
        int num6=500;
        int result1=(num1+num2)-num3;
        int result2=(num4*num5)/num6;
        int blank3=result2%result1;
        System.out.println(result2+ " modded by " +result1+ " + is " +blank3);
    }
}
