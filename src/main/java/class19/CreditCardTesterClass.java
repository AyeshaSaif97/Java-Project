package class19;

public class CreditCardTesterClass {


    public static void main(String[] args) {
        CreditCard c1 = new CreditCard();
        c1.callInterest(5000);
        Visa v = new Visa();
        v.callInterest(5000);
        AX ax = new AX();
        ax.callInterest(5000);


    }
}

