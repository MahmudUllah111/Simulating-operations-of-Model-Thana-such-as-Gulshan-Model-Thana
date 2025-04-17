package iub.gulshanmodelthana.m2_aumio_2230328;

public class AdminPersonnelModel {
    private String name;
    private String ID;
    private String training;
    private String status;
    private String result;


    public AdminPersonnelModel(String name, String ID, String training, String status, String result) {
        this.name = name;
        this.ID = ID;
        this.training = training;
        this.status = status;
        this.result = result;
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

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AdminPersonnelModel{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", training='" + training + '\'' +
                ", status='" + status + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
