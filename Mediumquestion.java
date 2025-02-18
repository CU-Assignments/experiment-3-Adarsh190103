import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPIN = 1234;
        double balance = 3000.0;

        System.out.print("Enter PIN: ");
        int enteredPIN = sc.nextInt();

        try {
            if (enteredPIN != correctPIN) {
                throw new Exception("Error: Invalid PIN.");
            }

            System.out.print("Withdraw Amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new Exception("Error: Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Current Balance: " + balance);
            sc.close();
        }
    }
}
