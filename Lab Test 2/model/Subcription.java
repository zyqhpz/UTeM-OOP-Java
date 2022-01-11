package model;

public class Subcription {
    private int id;
    private char type;
    private String description;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) throws InvalidSubcription {
        if (type == 'A' || type == 'B' || type == 'C') {
            this.type = type;
            if (type == 'A') {
                setPrice(30);
            } else if (type == 'B') {
                setPrice(600);
            } else {
                setPrice(1000);
            }
        } else {
            throw new InvalidSubcription(type);
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
