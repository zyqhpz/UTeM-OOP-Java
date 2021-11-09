
public class MyLab2Main {

    public static void main(String[] args) {

        Student student = new Student();
        Biodata studentBiodata = new Biodata();

        String phoneStudent = "0623232323";
        int noPhoneStudent = Integer.parseInt(phoneStudent.replaceFirst("^0*", ""));
        Address studentAddress = new Address(789, "Jalan Munshi Abdullah", 75600, "Melaka", noPhoneStudent);

        String phoneSchool = "0625252525";
        int noPhoneSchool = Integer.parseInt(phoneSchool.replaceFirst("^0*", ""));
        Address schoolAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", noPhoneSchool);
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
        System.out.println("No. phone: 0" + student.getBiodata().getHome_address().getNo_tel() + "\n");

        // Print school details
        System.out.println("--School Details--" + "\nName: " + school.getName());
        student.getSchool().getAddress().printAddress();
        System.out.println("No. phone: 0" + student.getSchool().getAddress().getNo_tel() + "\n");

    }
}
