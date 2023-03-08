public class Spelare {
    private String namn;
    private int gissningar;
    private int rättGissningar;

    public Spelare(String namn) {
        this.namn = namn;
        gissningar = 0;
        rättGissningar = 0;
    }

    public String getNamn() {
        return namn;
    }

    public int getGissningar() {
        return gissningar;
    }

    public int getPoäng() {
        return rättGissningar;
    }

    public void increaseGissningar() {
        gissningar++;
    }

    public void increasePoäng() {
        rättGissningar++;
    }
    public String toString(){
        return namn + " hade " + gissningar + " hade rätt i " + rättGissningar;
    }
}

