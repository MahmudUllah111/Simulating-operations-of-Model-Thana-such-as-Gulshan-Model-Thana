package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcCctvFootage_Model {
    private String footageid;
    private String location;
    private LocalDate date;

    public OcCctvFootage_Model(String footageid, String location, LocalDate date) {
        this.footageid = footageid;
        this.location = location;
        this.date = date;
    }

    public String getFootageid() {
        return footageid;
    }

    public void setFootageid(String footageid) {
        this.footageid = footageid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OcCctvFootage_Model{" +
                "footageid='" + footageid + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}
