package iub.gulshanmodelthana.m1_mahmudullah_2230406;

public class OcOnlineDatabase_Model {
    private String name;
    private String recordid;;
    private String contactno;
    private String address;
    private String caseno;
    private String casestatus;

    public OcOnlineDatabase_Model(String name, String recordid, String contactno, String address, String caseno, String casestatus) {
        this.name = name;
        this.recordid = recordid;
        this.contactno = contactno;
        this.address = address;
        this.caseno = caseno;
        this.casestatus = casestatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCaseno() {
        return caseno;
    }

    public void setCaseno(String caseno) {
        this.caseno = caseno;
    }

    public String getCasestatus() {
        return casestatus;
    }

    public void setCasestatus(String casestatus) {
        this.casestatus = casestatus;
    }

    @Override
    public String toString() {
        return "OcOnlineDatabase_Model{" +
                "name='" + name + '\'' +
                ", recordid='" + recordid + '\'' +
                ", contactno='" + contactno + '\'' +
                ", address='" + address + '\'' +
                ", caseno='" + caseno + '\'' +
                ", casestatus='" + casestatus + '\'' +
                '}';
    }
}
