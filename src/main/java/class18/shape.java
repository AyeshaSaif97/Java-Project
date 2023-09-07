package class18;

public class shape {
        float radius=3;


    }
    class circle extends shape {

       void area(){
            double area= radius * radius * Math.PI;
            System.out.println("Area of circle : " + area);
        }
    }


    class test {
        public static void main(String[] args) {
            circle obj = new circle();
            obj.area();

        }
    }