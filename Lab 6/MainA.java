public class MainA {
    public static void main(String[] args) throws NotEnoughAmount {
        double pay = 50;
        double amount = 60;
        double balance = 0;

        MainA payment = new MainA();

        try {
            balance = payment.doPay(pay, amount);
            System.out.println("Balance: " + balance);
        } catch (NotEnoughAmount ex) {
            System.out.println(ex.getMessage());
        }
    }

    public double doPay(double pay, double amount) throws NotEnoughAmount {
        double balance = 0;
        if (pay < amount) {
            throw new NotEnoughAmount();
        } else {
            balance = pay - amount;
        }
        return balance;
    }
}
