package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.Serializable;
import java.time.LocalDate;

public class NewGD_model implements Serializable {
    String ID, name, contact, details;
    LocalDate date;

    public NewGD_model(String ID, String name, String contact, String details, LocalDate date) {
        this.ID = ID;
        this.name = name;
        this.contact = contact;
        this.details = details;
        this.date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GD: " +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date;
    }
}
