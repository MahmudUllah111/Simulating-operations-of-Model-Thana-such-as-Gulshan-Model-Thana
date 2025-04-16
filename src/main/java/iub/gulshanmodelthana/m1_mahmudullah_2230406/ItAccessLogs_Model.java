package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class ItAccessLogs_Model {
    private String emailid;
    private String role;
    private LocalDate date;

    public ItAccessLogs_Model(String emailid, String role, LocalDate date) {
        this.emailid = emailid;
        this.role = role;
        this.date = date;
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

    @Override
    public String toString() {
        return "ItAccessLogs_Model{" +
                "emailid='" + emailid + '\'' +
                ", role='" + role + '\'' +
                ", date=" + date +
                '}';
    }
}
