package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class ItUnusuallogs_Model {
    private String emailid;
    private String role;
    private LocalDate date;
    private String activity;

    public ItUnusuallogs_Model(String emailid, String role, LocalDate date, String activity) {
        this.emailid = emailid;
        this.role = role;
        this.date = date;
        this.activity = activity;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "ItUnusuallogs_Model{" +
                "emailid='" + emailid + '\'' +
                ", role='" + role + '\'' +
                ", date=" + date +
                ", activity='" + activity + '\'' +
                '}';
    }
}
