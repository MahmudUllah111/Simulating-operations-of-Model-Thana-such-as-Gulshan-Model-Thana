package iub.gulshanmodelthana.m4_tasnia_2321147;

public class AssignedOfficer {
    private String name, id, branch, status ;

    public AssignedOfficer() {
    }

    public AssignedOfficer(String name, String id, String branch, String status) {
        this.name = name;
        this.id = id;
        this.branch = branch;
        this.status = status;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssignedOfficer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", branch='" + branch + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
