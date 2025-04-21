package iub.gulshanmodelthana.m4_tasnia_2321147;

public class Criminals {

    public String name, id, type, assigned, date;

    public Criminals() {
    }

    public Criminals(String name, String id, String type, String assigned, String date) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.assigned = assigned;
        this.date = date;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Criminals{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", assigned='" + assigned + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
