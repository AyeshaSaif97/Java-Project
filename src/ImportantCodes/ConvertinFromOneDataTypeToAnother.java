package ImportantCodes;

public class ConvertinFromOneDataTypeToAnother {
    public static void main(String[] args) {
        //byte->short->integer->long->float->double
        // implicit//widening//auto

        long age = 122151512515151L;

        //byte myAge=age;
        byte number = 10;
        int number2 = number;
        System.out.println(number2);


        float num1=15.6f;
        int num2;
        num2=(int)num1;
        System.out.println(num2);
    }
}
