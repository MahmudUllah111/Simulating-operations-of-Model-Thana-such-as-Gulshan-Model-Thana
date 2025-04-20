package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.Serializable;

public class IssueNotice_model implements Serializable {
    private static final long serialVersionUID = 1l;

    private String details;

    public IssueNotice_model(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "IssueNotice_model{" +
                "details='" + details + '\'' +
                '}';
    }
}
