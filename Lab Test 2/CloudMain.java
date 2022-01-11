import model.Customer;
import model.InsufficientAmount;
import model.InvalidSubcription;
import model.Subcription;

public class CloudMain {
    public static void main(String[] args) {
        Customer custOne = new Customer();
        custOne.setName("Abu");
        custOne.setEmail("abu@gmail.com");
        custOne.setCountry("Malaysia");
        custOne.setPassword("abc1234");
        custOne.setYear(4);
        Subcription subscription = new Subcription();
        try {
            subscription.setType('B');
            subscription.setDescription("Package B");
            custOne.setSubcription(subscription);
            System.out.println("Subscription Price \t:RM " + subscription.getPrice());
            System.out.println("Discount(%) \t\t: " + custOne.getDiscount());
            custOne.doPayment(2000);
            System.out.println("Total Price \t\t:RM " + custOne.getTotalPrice());
            System.out.println("Balance \t\t:RM " + custOne.getBalance());
        } catch (InvalidSubcription e) {
            System.out.println(e.getMessage());
        } catch (InsufficientAmount e) {
            e.printInsufficientAmount();
        }
    }
}
