package CS203Course.Lab_5.Question_6;

public class Automobiles extends Asset{

    public Automobiles(String serialNumber) {
        super(serialNumber);
    }

    public String toString() {
        return "Automobile: " + super.toString();
    }

}
