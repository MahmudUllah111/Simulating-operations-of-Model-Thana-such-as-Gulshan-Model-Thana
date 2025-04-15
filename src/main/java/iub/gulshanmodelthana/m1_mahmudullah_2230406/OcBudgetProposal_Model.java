package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import java.time.LocalDate;

public class OcBudgetProposal_Model {
    private String itemname;
    private String purpose;
    private String amount;
    private LocalDate submissiondate;

    public OcBudgetProposal_Model(String itemname, String purpose, String amount, LocalDate submissiondate) {
        this.itemname = itemname;
        this.purpose = purpose;
        this.amount = amount;
        this.submissiondate = submissiondate;
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

    @Override
    public String toString() {
        return "OcBudgetProposal_Model{" +
                "itemname='" + itemname + '\'' +
                ", purpose='" + purpose + '\'' +
                ", amount='" + amount + '\'' +
                ", submissiondate=" + submissiondate +
                '}';
    }
}
