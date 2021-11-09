import java.util.Vector;

public class Company {
    private String name;
    private Address address;
    private Vector<Supplier> suppliers;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Vector<Supplier> getSuppliers(Vector<Supplier> suppliers) {
        return suppliers;
    }

    public void setSuppliers(Vector<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

}
