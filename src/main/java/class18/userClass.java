package class18;

public class userClass {

    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }


}


class userInfo extends userClass {

    private String userAddress;


    public userInfo(String name, String mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }

    public void printInfo() {
        System.out.println(name + " " + mobileNumber + " " + userAddress);
    }


}