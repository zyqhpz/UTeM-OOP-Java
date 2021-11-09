import java.util.ArrayList;

public class MyLab2Main {

    public static void main(String[] args) {

        Student student = new Student();
        Biodata studentBiodata = new Biodata();

        Address studentAddress = new Address(789, "Jalan Munshi Abdullah", 75600, "Melaka", 623232323);
        Address schoolAddress = new Address(5, "Jalan Tun Fatimah", 75400, "Melaka", 625252525);

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

        mother.setName("Nurul Aminah");
        mother.setNo_ic("770211051122");
        mother.setAddress(motherAddress);
        mother.setOccupation("Guru");
        mother.setTel_no(motherAddress.getNo_tel());

        father.setName("Abdullah");
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

        // Print parent details
        System.out.println("--Parent Details--");
        System.out.println("Father: " + "\nName: " + father.getName() + "\nNo. IC: " + father.getNo_ic()
                + "\nOccupation: " + father.getOccupation());
        father.getAddress().printAddress();
        System.out.println("No. phone: 0" + father.getAddress().getNo_tel() + "\n");
        System.out.println("Mother: " + "\nName: " + mother.getName() + "\nNo. IC: " + mother.getNo_ic()
                + "\nOccupation: " + mother.getOccupation());
        mother.getAddress().printAddress();
        System.out.println("No. phone: 0" + mother.getAddress().getNo_tel() + "\n");
    }
}
