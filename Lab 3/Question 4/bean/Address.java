public class Address {
    private int number;
    private String road;
    private int postcode;
    private String state;
    private int no_tel;

    public Address(int number, String road, int postcode, String state, int no_tel) {
        this.number = number;
        this.road = road;
        this.postcode = postcode;
        this.state = state;
        this.no_tel = no_tel;
    }

    public int getNumber() {
        return number;
    }

    public String getRoad() {
        return road;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getState() {
        return state;
    }

    public int getNo_tel() {
        // return String.format("%010d", no_tel);
        return no_tel;
    }

    public void printAddress() {
        System.out.println("Address: No. " + number + ", " + road + ", " + postcode + ", " + state + ".");
    }
}
