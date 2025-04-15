package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class SiPetrolLogsModel {
private String officerName;
private String officerID;
private String petrolRoute;
private String vehicleType;
private LocalDate date;


    public SiPetrolLogsModel(String officerName, String officerID, String petrolRoute, String vehicleType, LocalDate date) {
        this.officerName = officerName;
        this.officerID = officerID;
        this.petrolRoute = petrolRoute;
        this.vehicleType = vehicleType;
        this.date = date;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOfficerID() {
        return officerID;
    }

    public void setOfficerID(String officerID) {
        this.officerID = officerID;
    }

    public String getPetrolRoute() {
        return petrolRoute;
    }

    public void setPetrolRoute(String petrolRoute) {
        this.petrolRoute = petrolRoute;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SiPetrolLogsModel{" +
                "officerName='" + officerName + '\'' +
                ", officerID='" + officerID + '\'' +
                ", petrolRoute='" + petrolRoute + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", date=" + date +
                '}';
    }
}
