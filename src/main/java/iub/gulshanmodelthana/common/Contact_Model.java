package iub.gulshanmodelthana.common;

import java.time.LocalDate;

public class Contact_Model {
    private String from;
    private String subject;
    private String message;
    private LocalDate date;

    public Contact_Model(String from, String subject, String message, LocalDate date) {
        this.from = from;
        this.subject = subject;
        this.message = message;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Contact_Model{" +
                "from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
