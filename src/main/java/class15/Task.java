package class15;

public class Task {


    private String address;


    public Task(String userAddress) {
        address = userAddress;

        System.out.println("Executed constructor with parameter " + userAddress);

    }

    public Task() {
        System.out.println("Executed constructor with No parameters");
    }


}