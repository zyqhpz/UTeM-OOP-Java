import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Utility utilityPhone = new Utility();
        utilityPhone.setBillNo("telephone-12-2015");
        utilityPhone.setTypeUtility("Telephone");

        Telephone meTelephone = new Telephone();
        meTelephone.setId("Cel001-12-2015");
        meTelephone.setMonth(12);
        meTelephone.setYear(2015);
        meTelephone.setAmount(50);

        try {
            meTelephone.doPayment(50);
        } catch (NotEnoughAmount e) {
            System.out.println(e.getMessage());
        }

        Telephone wiTelephone = new Telephone();

        wiTelephone.setId("Cel008-10-2015");
        wiTelephone.setMonth(10);
        wiTelephone.setYear(2015);
        wiTelephone.setAmount(50);

        try {
            wiTelephone.doPayment(100);
        } catch (NotEnoughAmount e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Telephone> telephones = new ArrayList<Telephone>();

        telephones.add(meTelephone);
        telephones.add(wiTelephone);
        System.out.println("Balance phone :" + utilityPhone.getBalance());

        for (Telephone phone : telephones) {
            System.out.println("Balance for telephones:" + phone.getBalance());
        }

    }
}
