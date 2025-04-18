package iub.gulshanmodelthana.m1_mahmudullah_2230406;

public class OcExternalCoordination_Model {
    private String name;
    private String id;
    private String details;

    public OcExternalCoordination_Model(String name, String id, String details) {
        this.name = name;
        this.id = id;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "OcExternalCoordination_Model{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
