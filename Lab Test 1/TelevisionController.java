import java.util.Calendar;

public class TelevisionController {
    private Television television;
    Calendar now = Calendar.getInstance();
    int currentYear = now.get(Calendar.YEAR);

    public void setTelevision(Television television) {
        this.television = television;
    }

    public Television getTelevision() {
        return television;
    }

    public double calculatePrice() {
        return (television.getPrice() * (1 - rebatebyYear())) - rebateIsAndroid() - rebateBySupplier();
    }

    public double rebatebyYear() {
        int year = currentYear - television.getYear();
        if (1 < year && year <= 2) {
            return 0.2;
        } else if (year > 2) {
            return 0.4;
        } else
            return 0;
    }

    public double rebateIsAndroid() {
        double value = 0;
        if (television.isAndroid()) {
            value = 100;
        }
        return value;
    }

    public double rebateBySupplier() {
        String supplier = television.getSupplier().getName();
        double value;

        if (supplier == "Sony Melaka") {
            value = 300;
        } else if (supplier == "LG Melaka") {
            value = 200;
        } else if (supplier == "Samsung Melaka") {
            value = 100;
        } else {
            value = 400;
        }
        return value;
    }

}
