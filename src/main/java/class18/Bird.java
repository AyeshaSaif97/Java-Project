package class18;

public class Bird {
    /*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and
define printInfo methods as well create the object of each class and call the methods
     */

    private String birdType;
    private String birdName;
    private String birdColor;
    private int birdAge;

    public Bird(String birdType, String birdName, String birdColor, int birdAge) {
        this.birdType = birdType;
        this.birdName = birdName;
        this.birdColor = birdColor;
        this.birdAge = birdAge;
    }

    public void printInfo() {
        System.out.println("Bird type: "+birdType +"\n"+" Bird name: " + birdName +"\n"+" Bird color:" + birdColor +"\n"+ " Bird Age: " + birdAge);
    }}

    class sparrow extends Bird {
        public sparrow(String birdType, String birdName, String birdColor, int birdAge) {
            super(birdType, birdName, birdColor, birdAge);
        }
    }

    class parrot extends Bird {
        public parrot(String birdType, String birdName, String birdColor, int birdAge) {

            super(birdType, birdName, birdColor, birdAge);
        }


    }







