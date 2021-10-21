public class MyLab2Main {

    public static void main(String[] args) {
        Student student = new Student();
        Biodata studentBiodata = new Biodata();
        Address studentAddress = new Address(789, "Jalan Munshi Abdullah", 75600, "Melaka", 0623232323);
        Address schoolAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", 0625252525);
        School studentSchool = new School();

        student.setNo_ID("A12345");

        studentBiodata.setNo_id("A12345");
        studentBiodata.setName("Ahmad");

        studentBiodata.setHome_address(studentAddress);

        studentSchool.setName("Sekolah Tun Tijah");
        studentSchool.setAddress(schoolAddress);

        student.setBiodata(studentBiodata);
        student.setForm(5);
        student.setSchool(studentSchool);

        System.out.println(student.getNo_ID() + " " + student.getBiodata().getName() + " " + student.getForm() + " "
                + student.getSchool().getName());
    }
}
