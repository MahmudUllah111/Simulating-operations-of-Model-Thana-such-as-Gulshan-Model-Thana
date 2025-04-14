package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcLeaveRequest_Model {
    private String requestid;
    private String officername;
    private String officerid;
    private LocalDate date;
    private String reason;

    public OcLeaveRequest_Model(String requestid, String officername, String officerid, LocalDate date, String reason) {
        this.requestid = requestid;
        this.officername = officername;
        this.officerid = officerid;
        this.date = date;
        this.reason = reason;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "OcLeaveRequest_Model{" +
                "requestid='" + requestid + '\'' +
                ", officername='" + officername + '\'' +
                ", officerid='" + officerid + '\'' +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                '}';
    }
}
