package gr.aueb.cf.schoolapp.dto;

public class TeacherInsertDTO {
    private String firstname;
    private String lastname;

    public TeacherInsertDTO() {}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
