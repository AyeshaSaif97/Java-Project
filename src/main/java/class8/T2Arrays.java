package class8;

public class T2Arrays {
    public static void main(String[] args) {

//count how many true values are present in array
        boolean[] condition = {true, false, true, false, true, true};
int count=0;
        for (int i =0; i<condition.length; i++){
            if(condition[i]){
                count++;
            }
        }
        System.out.println(count);
    }


}

/*
if(conds[i]==true){
             count= count+1;
            }  i
 */
