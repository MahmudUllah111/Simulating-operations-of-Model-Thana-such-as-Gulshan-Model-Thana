package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.Serializable;
import java.time.LocalDate;

public class SuspectEntry_model implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name, details;
    private LocalDate date;

    public SuspectEntry_model(String name, String details, LocalDate date) {
        this.name = name;
        this.details = details;
        this.date = date;
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
        return "SuspectEntry_model{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                '}';
    }
}
