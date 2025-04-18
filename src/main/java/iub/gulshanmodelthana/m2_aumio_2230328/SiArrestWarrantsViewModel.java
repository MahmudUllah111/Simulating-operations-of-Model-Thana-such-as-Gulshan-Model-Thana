package iub.gulshanmodelthana.m2_aumio_2230328;

public class SiArrestWarrantsViewModel {
    private String suspectName;
    private String warrantID;
    private String suspectAge;
    private String suspectHomeAddrress;
    private String suspectContaactNumber;
    private String suspectDetails;

    public SiArrestWarrantsViewModel(String suspectName, String warrantID, String suspectAge, String suspectHomeAddrress, String suspectContaactNumber, String suspectDetails) {
        this.suspectName = suspectName;
        this.warrantID = warrantID;
        this.suspectAge = suspectAge;
        this.suspectHomeAddrress = suspectHomeAddrress;
        this.suspectContaactNumber = suspectContaactNumber;
        this.suspectDetails = suspectDetails;
    }

    public String getSuspectName() {
        return suspectName;
    }

    public void setSuspectName(String suspectName) {
        this.suspectName = suspectName;
    }

    public String getWarrantID() {
        return warrantID;
    }

    public void setWarrantID(String warrantID) {
        this.warrantID = warrantID;
    }

    public String getSuspectAge() {
        return suspectAge;
    }

    public void setSuspectAge(String suspectAge) {
        this.suspectAge = suspectAge;
    }

    public String getSuspectHomeAddrress() {
        return suspectHomeAddrress;
    }

    public void setSuspectHomeAddrress(String suspectHomeAddrress) {
        this.suspectHomeAddrress = suspectHomeAddrress;
    }

    public String getSuspectContaactNumber() {
        return suspectContaactNumber;
    }

    public void setSuspectContaactNumber(String suspectContaactNumber) {
        this.suspectContaactNumber = suspectContaactNumber;
    }

    public String getSuspectDetails() {
        return suspectDetails;
    }

    public void setSuspectDetails(String suspectDetails) {
        this.suspectDetails = suspectDetails;
    }

    @Override
    public String toString() {
        return "SiArrestWarrantsViewModel{" +
                "suspectName='" + suspectName + '\'' +
                ", warrantID='" + warrantID + '\'' +
                ", suspectAge='" + suspectAge + '\'' +
                ", suspectHomeAddrress='" + suspectHomeAddrress + '\'' +
                ", suspectContaactNumber='" + suspectContaactNumber + '\'' +
                ", suspectDetails='" + suspectDetails + '\'' +
                '}';
    }
}
