public class iPhone {
    private int model;
    private String appleID;
    private double screenTime;
    boolean updated = false;

    public iPhone() {

    }

    public iPhone(int model, String appleID) {
        this.model = model;
        this.appleID = appleID;
    }

    public iPhone(int model, String appleID, float screenTime) {
        this.model = model;
        this.appleID = appleID;
        this.screenTime = screenTime;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getAppleID() {
        return appleID;
    }

    public void setAppleID(String appleID) {
        this.appleID = appleID;
    }

    public double getScreenTime() {
        return screenTime;
    }

    public void setScreenTime(double screenTime) {
        this.screenTime = screenTime;
    }

    public void isUpdated() {
        updated = true;
    }

    public String toUpgrade() {
        if (updated) {
            return "No update needed";
        } else {
            return "Time for an update!";
        }
    }
    public static void main(String[] args) throws Exception {
        iPhone myIPhone = new iPhone();
        myIPhone.model = 11;
        myIPhone.appleID = "eltiganieiman@gmail.com";
        myIPhone.screenTime = 10.5;

        myIPhone.isUpdated();

        System.out.println("Apple ID: " + myIPhone.getAppleID() + "\nIphone " 
            + myIPhone.getModel() + "\nAverage screen time: " + myIPhone.getScreenTime()
            + "\nIOS: " + myIPhone.toUpgrade());

    }
}
