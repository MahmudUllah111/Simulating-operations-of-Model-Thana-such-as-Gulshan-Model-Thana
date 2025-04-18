package iub.gulshanmodelthana.m1_mahmudullah_2230406;

public class ItSmErrorLogs_Model {
    private String errorcode;
    private String errordetails;

    public ItSmErrorLogs_Model(String errorcode, String errordetails) {
        this.errorcode = errorcode;
        this.errordetails = errordetails;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrordetails() {
        return errordetails;
    }

    public void setErrordetails(String errordetails) {
        this.errordetails = errordetails;
    }

    @Override
    public String toString() {
        return "ItSmErrorLogs_Model{" +
                "errorcode='" + errorcode + '\'' +
                ", errordetails='" + errordetails + '\'' +
                '}';
    }
}
