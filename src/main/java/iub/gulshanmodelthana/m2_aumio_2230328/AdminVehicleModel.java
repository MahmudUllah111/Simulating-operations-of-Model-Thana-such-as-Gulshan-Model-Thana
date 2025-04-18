package iub.gulshanmodelthana.m2_aumio_2230328;

public class AdminVehicleModel {

    private String ID;
    private String time;
    private String distance;
    private String fuel;


    public AdminVehicleModel(String ID, String time, String distance, String fuel) {
        this.ID = ID;
        this.time = time;
        this.distance = distance;
        this.fuel = fuel;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "AdminVehicleModel{" +
                "ID='" + ID + '\'' +
                ", time='" + time + '\'' +
                ", distance='" + distance + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
