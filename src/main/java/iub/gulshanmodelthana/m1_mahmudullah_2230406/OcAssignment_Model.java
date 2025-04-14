package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcAssignment_Model {
    private String assignmentid;
    private String officerid;
    private String assignedofficername;
    private LocalDate duedate;
    private String details;
    private String assignmentprogress;

    public OcAssignment_Model(String assignmentid, String officerid, String assignedofficername, LocalDate duedate, String details, String assignmentprogress) {
        this.assignmentid = assignmentid;
        this.officerid = officerid;
        this.assignedofficername = assignedofficername;
        this.duedate = duedate;
        this.details = details;
        this.assignmentprogress = assignmentprogress;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid;
    }

    public String getOfficerid() {
        return officerid;
    }

    public void setOfficerid(String officerid) {
        this.officerid = officerid;
    }

    public String getAssignedofficername() {
        return assignedofficername;
    }

    public void setAssignedofficername(String assignedofficername) {
        this.assignedofficername = assignedofficername;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAssignmentprogress() {
        return assignmentprogress;
    }

    public void setAssignmentprogress(String assignmentprogress) {
        this.assignmentprogress = assignmentprogress;
    }

    @Override
    public String toString() {
        return "OcAssignment_Model{" +
                "assignmentid='" + assignmentid + '\'' +
                ", officerid='" + officerid + '\'' +
                ", assignedofficername='" + assignedofficername + '\'' +
                ", duedate=" + duedate +
                ", details='" + details + '\'' +
                ", assignmentprogress='" + assignmentprogress + '\'' +
                '}';
    }
}