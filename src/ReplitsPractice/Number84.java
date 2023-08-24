package ReplitsPractice;

public class Number84 {
    public static void main(String[] args) {
        /*
        	{

**For you to do:**

Write a program that prints the total number of elements that are negative AND odd

**Output:**
for example -3 is both negative and odd

```
3
```
         */
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (a[i][j]%2!=0&&a[i][j]<0){
                count++;
                }

            }
        }
        System.out.println(count++);

    }
}


