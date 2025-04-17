package iub.gulshanmodelthana.m2_aumio_2230328;

import java.time.LocalDate;

public class AdminLegalDocumentsModel {
    private String type;
    private String number;
    private LocalDate date;
    private String status;
    private String document;

    public AdminLegalDocumentsModel(String type, String number, LocalDate date, String status, String document) {
        this.type = type;
        this.number = number;
        this.date = date;
        this.status = status;
        this.document = document;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "AdminLegalDocumentsModel{" +
                "type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
