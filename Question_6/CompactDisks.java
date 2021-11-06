package CS203Course.Lab_5.Question_6;

public class CompactDisks extends Asset {

    public CompactDisks(String serialNumber) {
        super(serialNumber);
    }
    public String toString() {
        return "CompactDisk: " + super.toString();
    }
}
