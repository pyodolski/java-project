package day_6;

public class Residentid {
    private String residentNo;
    public String name;
    public String address;

    public Residentid(String residentNo, String name, String address) {
        this.residentNo = residentNo;
        this.name = name;
        this.address = address;
    }

    public String getResidentNo() {
        return residentNo;
    }

    public void setResidentNo(String residentNo) {
        this.residentNo = residentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
