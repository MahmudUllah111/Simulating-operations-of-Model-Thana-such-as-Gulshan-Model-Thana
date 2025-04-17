package iub.gulshanmodelthana.m2_aumio_2230328;

import java.time.LocalDate;

public class AdminNoticesModel {
    private String subject;
    private String name;
    private LocalDate date;
    private String notice;

    public AdminNoticesModel(String subject, String name, LocalDate date, String notice) {
        this.subject = subject;
        this.name = name;
        this.date = date;
        this.notice = notice;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "AdminNoticesModel{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", notice='" + notice + '\'' +
                '}';
    }
}
