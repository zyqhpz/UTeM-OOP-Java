public class NotEnoughAmount extends Exception {
    public NotEnoughAmount() {
        super();
    }

    public String getMessage() {
        return "Not Enough Amount";
    }
}