package CS203Course.Lab_5.Question_6;

public class Furniture extends Asset{

    public Furniture(String serialNumber) {
        super(serialNumber);
    }
    public String toString() {
        return "Furniture: " + super.toString();
    }
}
