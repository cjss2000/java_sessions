package sessions.inheritance;

public class Electronics extends Item {

    private boolean hasBattery;

    public Electronics(String title, double price, boolean hasBattery) {
        super(title, price);
        this.hasBattery = hasBattery;
    }

    public boolean hasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Battery: " + hasBattery;
    }
}
