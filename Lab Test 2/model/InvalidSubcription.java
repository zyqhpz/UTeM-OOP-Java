package model;

public class InvalidSubcription extends Exception {
    private char type;

    public InvalidSubcription(char type) {
        this.type = type;
    }

    public String getMessage() {
        return "Invalid Subscription of type " + type;
    }
}
