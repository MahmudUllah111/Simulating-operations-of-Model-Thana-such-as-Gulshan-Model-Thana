package iub.gulshanmodelthana.m2_aumio_2230328;

public class SiBailApplicationsModel {
    private String name;
    private String ID;
    private String accusedCrime;
    private String duration;

    public SiBailApplicationsModel(String name, String ID, String accusedCrime, String duration) {
        this.name = name;
        this.ID = ID;
        this.accusedCrime = accusedCrime;
        this.duration = duration;
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

    public String getAccusedCrime() {
        return accusedCrime;
    }

    public void setAccusedCrime(String accusedCrime) {
        this.accusedCrime = accusedCrime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "SiBailApplicationsModel{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", accusedCrime='" + accusedCrime + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
