package ReplitsPractice;

public class Number74 {
    public static void main(String[] args) {
        /*
        **For you to do:**
Write a program that creates an array of integers of size 11.
*  Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.
2010
2011
2012
2013
2014
2015
2016
2017
2018
2019
2020
```
         */
        int[] years = new int[11];
        int sum = 2010;
        for (int i = 0; i <= years.length - 1; i++) {
            System.out.println(sum);
            years[i] = sum;
            sum++;
        }
    }
}

