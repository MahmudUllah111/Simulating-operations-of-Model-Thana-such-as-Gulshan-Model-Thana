package iub.gulshanmodelthana.m2_aumio_2230328;

public class AdminMaintainanceModel {
    private  String type;
    private  String status;
    private  String name;
    private  String ID;

    public AdminMaintainanceModel(String type, String status, String name, String ID) {
        this.type = type;
        this.status = status;
        this.name = name;
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "AdminMaintainanceModel{" +
                "type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
