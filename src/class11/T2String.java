package class11;

public class T2String {
    public static void main(String[] args) {

        String str = "sunday";
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            //System.out.print(str.charAt(i)+" ");
            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);

    }
}