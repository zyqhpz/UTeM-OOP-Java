public class Flower extends Plant {
    public Flower() {
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getName() {
        return super.name;
    }

    public void displayPlant() {
        System.out.println("This is " + getName() + " flower plant");
    }
}
