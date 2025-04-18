package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcCrimeReport_Model {
    private String reportname;
    private String location;
    private LocalDate date;
    private String reporttype;
    private String crimescenedetails;

    public OcCrimeReport_Model(String reportname, String location, LocalDate date, String reporttype, String crimescenedetails) {
        this.reportname = reportname;
        this.location = location;
        this.date = date;
        this.reporttype = reporttype;
        this.crimescenedetails = crimescenedetails;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
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

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getCrimescenedetails() {
        return crimescenedetails;
    }

    public void setCrimescenedetails(String crimescenedetails) {
        this.crimescenedetails = crimescenedetails;
    }

    @Override
    public String toString() {
        return "OcCrimeReport_Model{" +
                "reportname='" + reportname + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", reporttype='" + reporttype + '\'' +
                ", crimescenedetails='" + crimescenedetails + '\'' +
                '}';
    }
}
