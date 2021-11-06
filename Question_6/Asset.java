package CS203Course.Lab_5.Question_6;

public class Asset {

    String serialNumber;

    public Asset(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public String toString() {
        return serialNumber + "";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if( ! (obj instanceof Asset)) return false;
        Asset a = (Asset) obj;
        return serialNumber.equals(a.serialNumber);
    }
}
