package ReplitsPractice;

public class Number81 {
    public static void main(String[] args) {
        /*
        **For you to do:**

Write a program that prints the highest value in the array.

**Expected Output:**
input [5,4,8]

```
8
```
         */


        int [] num={5,4,8};

        int largest=0;

        for (int i = 0; i < num.length ; i++) {
            if(largest>num[i]);
            largest=num[i];

        }System.out.println(largest);



    }
}


