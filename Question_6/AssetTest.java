package CS203Course.Lab_5.Question_6;

public class AssetTest {

    public static void main(String[] args) {

        Asset_Tracker assetTrackingProgram = new Asset_Tracker();

        Automobiles auto = new Automobiles("123456");
        CompactDisks disks = new CompactDisks("654321");
        Electronics appliances = new Electronics("1234");
        Furniture fur = new Furniture("65489");

        assetTrackingProgram.add(auto);
        assetTrackingProgram.add(disks);
        assetTrackingProgram.add(appliances);
        assetTrackingProgram.add(fur);

        for (Asset a : assetTrackingProgram.getAssets()) {
            System.out.println(a);
        }


        System.out.println("Found: " + assetTrackingProgram.findAsset("654321"));
    }
}
