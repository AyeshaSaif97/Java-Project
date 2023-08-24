package class1;

public class practice {
    public static void main(String[] args) {
        int [] temperature = {35,29,25,16,21,40,12};

        int highest=0;
        int lowest=0;

        for (int i = 0 ; i < temperature.length ; i++){
            if(temperature[i]>highest)
                System.out.println(highest);
            if(temperature[i]<lowest)
                System.out.println(lowest);
        }
    }
}

