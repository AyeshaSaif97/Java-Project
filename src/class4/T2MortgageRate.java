package class4;

public class T2MortgageRate {
    public static void main(String[] args) {
        double mortgageRate = 4.9;
        double mortgagePrice = 60000;
        if (mortgageRate > 4.5) {
            System.out.println("User will not buy a house");
        } else {
            System.out.println("User will consider buying a house");
        }
        if (mortgagePrice > 50000) {
            System.out.println("User will take loan");
        } else {
            System.out.println("User will pay cash");
        }


    }
}
