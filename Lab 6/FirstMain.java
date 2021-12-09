public class FirstMain {
    public static void main(String[] args) {
        Utility utility = new Utility();
        utility.setBillNo("W0012-12-2015");
        utility.setMonth(10);
        utility.setYear(2015);
        utility.setTypeUtility("Water");
        utility.setAmount(20.00f);
        try {
            utility.doPayment(50);
        } catch (NotEnoughAmount e) {
            e.printStackTrace();
        }
        System.out.print("Bill no :" + utility.getBillNo());
        System.out.println(" Balance : " + utility.getBalance());
    }
}