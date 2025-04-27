package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcBudgetProposal_Model {
    private String itemname;
    private String purpose;
    private String amount;
    private LocalDate submissiondate;
    private String status;

    public OcBudgetProposal_Model(String itemname, String purpose, String amount, LocalDate submissiondate, String status) {
        this.itemname = itemname;
        this.purpose = purpose;
        this.amount = amount;
        this.submissiondate = submissiondate;
        this.status = status;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public LocalDate getSubmissiondate() {
        return submissiondate;
    }

    public void setSubmissiondate(LocalDate submissiondate) {
        this.submissiondate = submissiondate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OcBudgetProposal_Model{" +
                "itemname='" + itemname + '\'' +
                ", purpose='" + purpose + '\'' +
                ", amount='" + amount + '\'' +
                ", submissiondate=" + submissiondate +
                ", status='" + status + '\'' +
                '}';
    }
}
