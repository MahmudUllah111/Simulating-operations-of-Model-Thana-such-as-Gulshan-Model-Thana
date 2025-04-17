package iub.gulshanmodelthana.m1_mahmudullah_2230406;

public class ItSmSystemInfo_Model {
    private String softwareversion;
    private String patches;

    public ItSmSystemInfo_Model(String softwareversion, String patches) {
        this.softwareversion = softwareversion;
        this.patches = patches;
    }

    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }

    public String getPatches() {
        return patches;
    }

    public void setPatches(String patches) {
        this.patches = patches;
    }

    @Override
    public String toString() {
        return "ItSmSystemInfo_Model{" +
                "softwareversion='" + softwareversion + '\'' +
                ", patches='" + patches + '\'' +
                '}';
    }
}
