import java.util.Calendar;
import java.util.Date;

public class Telephone extends Utility {
    private String id;
    private int day;

    public Telephone() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int checkDayOfCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    protected void calcPayment() throws NotEnoughAmount {
        if (checkCurrentMonth() <= super.getMonth()) {
            if (super.payment < super.amount) {
                throw new NotEnoughAmount();
            } else {
                if (checkDayOfCurrentMonth() <= 20) {
                    super.setAmount(super.getAmount() * 0.9f);
                }
                super.balance = this.payment - super.amount;
            }
        } else {
            if (super.payment < this.amount) {
                throw new NotEnoughAmount();
            } else {
                super.balance = super.payment - super.amount - (super.amount * 0.06f);
            }
        }
    }
}
