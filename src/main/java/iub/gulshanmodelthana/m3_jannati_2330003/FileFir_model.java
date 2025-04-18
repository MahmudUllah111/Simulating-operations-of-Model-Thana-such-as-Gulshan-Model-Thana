package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.Serializable;
import java.time.LocalDate;

public class FileFir_model implements Serializable {
    private static final long serialVersionUID = 1L;
    private String ID, name, details;
    private LocalDate date;

    public FileFir_model(String ID, String name, String details, LocalDate date) {
        this.ID = ID;
        this.name = name;
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
        return "FileFir_model{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                '}';
    }
}
