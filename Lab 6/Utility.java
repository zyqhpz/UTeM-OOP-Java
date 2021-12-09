import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Utility {
    private String billNo;
    private int month;
    private int year;
    private String typeUtility;
    private float amount;
    private float payment;
    private float balance;
    // private ArrayList<Telephone> telephones;

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

    // public Telephones getTelephones() {
    // return telephones;
    // }

    // public void setTelephones(Telephones telephones) {
    // this.telephones = telephones;
    // }

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
        // throw new UnsupportedOperationException();
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

    private void calcPayment() throws NotEnoughAmount {
        if (this.month <= checkCurrentMonth()) {
            throw new NotEnoughAmount();
        }
        balance = amount - payment;
    }

    public float getBalance() {
        return balance;
    }
}
