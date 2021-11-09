package bean;

public class Student {
    private String no_id;
    private Biodata biodata;
    private int form;
    private School school;

    public Student(String no_id, Biodata biodata, int form, School school) {
        this.no_id = no_id;
        this.biodata = biodata;
        this.form = form;
        this.school = school;
    }

    public Student() {
    }

    public String setNo_ID(String no_id) {
        this.no_id = no_id;
        return no_id;
    }

    public int setForm(int form) {
        this.form = form;
        return form;
    }

    public School setSchool(School school) {
        this.school = school;
        return school;
    }

    public Biodata setBiodata(Biodata biodata) {
        this.biodata = biodata;
        return biodata;
    }

    public String getNo_ID() {
        return no_id;
    }

    public Biodata getBiodata() {
        return biodata;
    }

    public int getForm() {
        return form;
    }

    public School getSchool() {
        return school;
    }
}
