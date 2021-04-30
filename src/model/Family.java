package model;

public class Family {
    private String fullname;
    private String address;
    private String id;

    public Family() {

    }

    public Family(String fullname, String address, String id) {
        this.fullname = fullname;
        this.address = address;
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Family{" +
                "fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
