public class Biodata {
    private String no_id;
    private String name;
    private Address home_address;

    public Biodata(String no_id, String name, Address home_address) {
        this.no_id = no_id;
        this.name = name;
        this.home_address = home_address;
    }

    public Biodata() {
    }

    public String setNo_id(String no_id) {
        this.no_id = no_id;
        return no_id;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public Address setHome_address(Address address) {
        this.home_address = address;
        return address;
    }

    public String getNo_id() {
        return no_id;
    }

    public String getName() {
        return name;
    }

    public Address getHome_address() {
        return home_address;
    }
}
