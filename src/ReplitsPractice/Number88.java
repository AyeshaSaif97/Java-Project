package ReplitsPractice;

public class Number88 {

       /*
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
        */
        String breed;
        String name;
        String color;


        void behavior(){System.out.println(breed +" can bark");}
    void behavior2(){
        System.out.println(breed +" can run ");}
        void behaviour3(){
            System.out.println(breed +" can play");}


    public static void main(String[] args) {

        Number88 dog1 = new Number88();
        dog1.breed = "Husky";
        dog1.name = "Lucy";
        dog1.color = "grey";
        dog1.behavior();
        dog1.behavior2();
        dog1.behaviour3();

        Number88 dog2 = new Number88();
        dog2.breed = "Bulldog";
        dog2.name = "Mufford";
        dog2.color = "grey";
        dog2.behavior();
        dog2.behavior2();
        dog2.behaviour3();


        Number88 dog3 = new Number88();
        dog3.breed = "Labrador";
        dog3.name = "Lessi";
        dog3.color = "grey";
        dog3.behavior();
        dog3.behavior2();
        dog3.behaviour3();


    }

}




