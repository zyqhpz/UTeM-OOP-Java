public class Parent {
    private String no_ic;
    private String name;
    private Address address;
    private String occupation;
    private int tel_no;

    public Parent() {
    }

    public void setNo_ic(String no_ic) {
        this.no_ic = no_ic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setTel_no(int tel_no) {
        this.tel_no = tel_no;
    }

    public String getNo_ic() {
        return no_ic;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getTel_no() {
        return tel_no;
    }
}
