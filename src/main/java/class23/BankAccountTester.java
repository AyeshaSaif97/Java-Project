package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Marta", 1252, 1500, "user123", "Pass123", "Checking");
       System.out.println(b.getName());
       System.out.println(b.getBankAccountNumber());
       b.SetName("Shawn");
       System.out.println(b.getName());
    }
}

