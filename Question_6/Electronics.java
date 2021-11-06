package CS203Course.Lab_5.Question_6;

public class Electronics extends Asset{

    public Electronics(String serialNumber) {
        super(serialNumber);
    }
    public String toString() {
        return "ElectronicAppliances: " + super.toString();
    }
}
