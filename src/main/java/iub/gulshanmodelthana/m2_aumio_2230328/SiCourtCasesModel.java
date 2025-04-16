package iub.gulshanmodelthana.m2_aumio_2230328;

public class SiCourtCasesModel {
    private String caseType;
    private  String caseName;
    private  String caseID;
    private  String caseStatus;

    public SiCourtCasesModel(String caseType, String caseName, String caseID, String caseStatus) {
        this.caseType = caseType;
        this.caseName = caseName;
        this.caseID = caseID;
        this.caseStatus = caseStatus;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    @Override
    public String toString() {
        return "SiCourtCasesModel{" +
                "caseType='" + caseType + '\'' +
                ", caseName='" + caseName + '\'' +
                ", caseID='" + caseID + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                '}';
    }
}
