package iub.gulshanmodelthana.m2_aumio_2230328;

import java.time.LocalDate;

public class SiEvidenceLogsModel {
    private String itemDetail;
    private String reportID;
    private String evidenceLocation;
    private LocalDate evidenceCollectionDate;

    public SiEvidenceLogsModel(String itemDetail, String reportID, String evidenceLocation, LocalDate evidenceCollectionDate) {
        this.itemDetail = itemDetail;
        this.reportID = reportID;
        this.evidenceLocation = evidenceLocation;
        this.evidenceCollectionDate = evidenceCollectionDate;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getEvidenceLocation() {
        return evidenceLocation;
    }

    public void setEvidenceLocation(String evidenceLocation) {
        this.evidenceLocation = evidenceLocation;
    }

    public LocalDate getEvidenceCollectionDate() {
        return evidenceCollectionDate;
    }

    public void setEvidenceCollectionDate(LocalDate evidenceCollectionDate) {
        this.evidenceCollectionDate = evidenceCollectionDate;
    }

    @Override
    public String toString() {
        return "SiEvidenceLogsModel{" +
                "itemDetail='" + itemDetail + '\'' +
                ", reportID='" + reportID + '\'' +
                ", evidenceLocation='" + evidenceLocation + '\'' +
                ", evidenceCollectionDate=" + evidenceCollectionDate +
                '}';
    }
}
