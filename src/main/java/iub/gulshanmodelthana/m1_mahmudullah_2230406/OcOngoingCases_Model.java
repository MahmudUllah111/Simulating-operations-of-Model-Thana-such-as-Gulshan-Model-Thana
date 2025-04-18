package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcOngoingCases_Model {
    private String caseid;
    private String officername;
    private String officerid;
    private String crimetype;
    private LocalDate dateofincident;
    private String suspectinfo;
    private String casestatus;

    public OcOngoingCases_Model(String caseid, String officername, String officerid, String crimetype, LocalDate dateofincident, String suspectinfo, String casestatus) {
        this.caseid = caseid;
        this.officername = officername;
        this.officerid = officerid;
        this.crimetype = crimetype;
        this.dateofincident = dateofincident;
        this.suspectinfo = suspectinfo;
        this.casestatus = casestatus;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getOfficername() {
        return officername;
    }

    public void setOfficername(String officername) {
        this.officername = officername;
    }

    public String getOfficerid() {
        return officerid;
    }

    public void setOfficerid(String officerid) {
        this.officerid = officerid;
    }

    public String getCrimetype() {
        return crimetype;
    }

    public void setCrimetype(String crimetype) {
        this.crimetype = crimetype;
    }

    public LocalDate getDateofincident() {
        return dateofincident;
    }

    public void setDateofincident(LocalDate dateofincident) {
        this.dateofincident = dateofincident;
    }

    public String getSuspectinfo() {
        return suspectinfo;
    }

    public void setSuspectinfo(String suspectinfo) {
        this.suspectinfo = suspectinfo;
    }

    public String getCasestatus() {
        return casestatus;
    }

    public void setCasestatus(String casestatus) {
        this.casestatus = casestatus;
    }

    @Override
    public String toString() {
        return "OcOngoingCases_Model{" +
                "caseid='" + caseid + '\'' +
                ", officername='" + officername + '\'' +
                ", officerid='" + officerid + '\'' +
                ", crimetype='" + crimetype + '\'' +
                ", dateofincident=" + dateofincident +
                ", suspectinfo='" + suspectinfo + '\'' +
                ", casestatus='" + casestatus + '\'' +
                '}';
    }
}
