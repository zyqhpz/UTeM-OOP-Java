import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Utility {
    protected String billNo;
    protected int month;
    protected int year;
    protected String typeUtility;
    protected float amount;
    protected float payment;
    protected float balance;
    protected ArrayList<Telephone> telephones;

    public Utility() {
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getType() {
        return typeUtility;
    }

    public void setType(String typeUtility) {
        this.typeUtility = typeUtility;
    }

    public ArrayList<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(ArrayList<Telephone> telephones) {
        this.telephones = telephones;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTypeUtility() {
        return typeUtility;
    }

    public void setTypeUtility(String typeUtility) {
        this.typeUtility = typeUtility;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int checkCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(Calendar.MONTH);
    }

    public void doPayment(float payment) throws NotEnoughAmount {
        this.payment = payment;
        calcPayment();
    }

    protected void calcPayment() throws NotEnoughAmount {
        if (checkCurrentMonth() <= month) {
            if (payment < amount) {
                throw new NotEnoughAmount();
            } else {
                balance = payment - amount;
            }
        } else {
            if (payment < amount) {
                throw new NotEnoughAmount();
            } else {
                balance = payment - amount - (amount * 0.06f);
            }
        }
    }

    public float getBalance() {
        return balance;
    }
}
