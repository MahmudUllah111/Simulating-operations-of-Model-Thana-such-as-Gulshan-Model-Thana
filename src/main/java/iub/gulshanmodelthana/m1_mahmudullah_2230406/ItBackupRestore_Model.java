package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class ItBackupRestore_Model {
    private String filename;
    private String filecontent;
    private LocalDate date;

    public ItBackupRestore_Model(String filename, String filecontent, LocalDate date) {
        this.filename = filename;
        this.filecontent = filecontent;
        this.date = date;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilecontent() {
        return filecontent;
    }

    public void setFilecontent(String filecontent) {
        this.filecontent = filecontent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ItBackupRestore_Model{" +
                "filename='" + filename + '\'' +
                ", filecontent='" + filecontent + '\'' +
                ", date=" + date +
                '}';
    }
}


