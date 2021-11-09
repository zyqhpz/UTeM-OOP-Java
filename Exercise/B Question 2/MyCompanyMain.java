import java.util.Vector;

public class MyCompanyMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("ABC sdn bhd");
        Address address = new Address(123, "Jalan UTeM", "Durian Tunggal", 76100, "Melaka", 06123456);
        company.setAddress(address);

        Vector<Supplier> suppliers = new Vector<Supplier>();

        Supplier supplierBuku = new Supplier();
        supplierBuku.setSupplierName("Syarikat Buku Sdn Bhd");
        Address supplierBukuAddress = new Address(3, "Jalan Munsyi", "Ayer Keroh", 75400, "Melaka", 06123123);
        supplierBuku.setAddress(supplierBukuAddress);
        Supplier supplierComputer = new Supplier();
        supplierComputer.setSupplierName("Syarikat Computer Sdn Bhd");
        Address supplierComputerAddress = new Address(3, "Jalan Bukit Beruang", "Ayer Keroh", 75400, "Melaka",
                06111223);
        supplierComputer.setAddress(supplierComputerAddress);

        suppliers.add(supplierBuku);
        suppliers.add(supplierComputer);

        company.setSuppliers(suppliers);

        Address comp_Address = company.getAddress();

        System.out.println(comp_Address.getNoShop() + " : " + comp_Address.getRoad() + " : "
                + comp_Address.getDistrict() + " : " + comp_Address.getPhone());

        for (Supplier s : company.getSuppliers(suppliers)) {
            System.out.print(s.getSupplierName() + " \t: ");
            Address supp_Address = s.getAddress();
            System.out.println(supp_Address.getNoShop() + " : " + supp_Address.getRoad() + " : "
                    + supp_Address.getDistrict() + " : " + supp_Address.getPhone());
        }
    }
}