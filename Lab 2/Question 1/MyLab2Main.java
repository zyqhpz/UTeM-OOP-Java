public class MyLab2Main {

    public static void main(String[] args) {
        Student student = new Student();
        Biodata studentBiodata = new Biodata();
        Address studentAddress = new Address(789, "Jalan Munshi Abdullah", 75600, "Melaka", 623232323);
        Address schoolAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", 625252525);
        School school = new School();

        student.setNo_ID("A12345");

        studentBiodata.setNo_id("A12345");
        studentBiodata.setName("Ahmad");

        studentBiodata.setHome_address(studentAddress);

        school.setName("Sekolah Tun Tijah");
        school.setAddress(schoolAddress);

        student.setBiodata(studentBiodata);
        student.setForm(5);
        student.setSchool(school);

        // Print student details
        System.out.println(
                "--Student Details--" + "\nID: " + student.getNo_ID() + "\nName: " + student.getBiodata().getName()
                        + "\nForm: " + student.getForm() + "\nSchool Name: " + student.getSchool().getName());
        student.getBiodata().getHome_address().printAddress();
        System.out.println("No. phone: " + student.getBiodata().getHome_address().getNo_tel() + "\n");

        // Print school details
        System.out.println("--School Details--" + "\nName: " + school.getName());
        student.getSchool().getAddress().printAddress();
        System.out.println("No. phone: " + student.getSchool().getAddress().getNo_tel() + "\n");

    }
}
