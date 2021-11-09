import java.util.ArrayList;

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

        ArrayList<Parent> parents = new ArrayList<Parent>();

        Parent mother = new Parent();
        Parent father = new Parent();

        Address motherAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", 11224435);
        Address fatherAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", 11224435);

        studentBiodata.setNo_id("A12345");
        studentBiodata.setName("Ahmad");

        studentBiodata.setHome_address(studentAddress);

        school.setName("Sekolah Tun Tijah");
        school.setAddress(schoolAddress);

        student.setBiodata(studentBiodata);
        student.setForm(5);
        student.setSchool(school);

        mother.setName("Nurul Amalah");
        mother.setNo_ic("770211051122");
        mother.setAddress(motherAddress);
        mother.setOccupation("Guru");
        mother.setTel_no(motherAddress.getNo_tel());

        father.setName("Mohd Zain");
        father.setNo_ic("750505102211");
        father.setAddress(fatherAddress);
        father.setOccupation("Pensyarah");
        father.setTel_no(fatherAddress.getNo_tel());

        parents.add(mother);
        parents.add(father);

        student.setParents(parents);

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
