package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class ItRegisterLogs_Model {
    private String name;
    private String emailid;
    private String password;
    private LocalDate date;
    private String role;

    public ItRegisterLogs_Model(String name, String emailid, String password, LocalDate date, String role) {
        this.name = name;
        this.emailid = emailid;
        this.password = password;
        this.date = date;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ItRegisterLogs_Model{" +
                "name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", password='" + password + '\'' +
                ", date=" + date +
                ", role='" + role + '\'' +
                '}';
    }
}
