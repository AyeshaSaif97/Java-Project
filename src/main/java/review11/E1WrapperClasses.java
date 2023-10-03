package review11;

public class E1WrapperClasses {
    public static void main(String[] args) {

        int a=10;
        double b=a;
        System.out.println(b);

        int f=30;
        Integer g=f;
        System.out.println(g);
        //converted data type from primitive int to an equivalent Wrapper Integer
        //hence is called boxing

        double u=30.5;
        Double t=u;
        System.out.println(u);


        Boolean o=false;
        boolean s=o;
        System.out.println(s);
        //converted an equivalent Wrapper Boolean to a primitive boolean
        //hence is called unboxing






    }
}
