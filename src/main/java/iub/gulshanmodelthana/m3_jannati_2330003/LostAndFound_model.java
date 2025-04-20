package iub.gulshanmodelthana.m3_jannati_2330003;

import java.io.Serializable;

public class LostAndFound_model implements Serializable {
    private final static long serialVersionUID = 1L;

    private String name, details;
    private boolean found;

    public LostAndFound_model(String name, String details) {
        this.name = name;
        this.details = details;
        this.found = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    @Override
    public String toString() {
        return "LostAndFound_model{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", found=" + found +
                '}';
    }
}
