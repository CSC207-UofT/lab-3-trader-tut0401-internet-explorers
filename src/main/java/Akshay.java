public class Akshay implements Tradable, Domesticatable, Drivable {
    private int maxSpeed;

    public Akshay() {
        this.maxSpeed = 1000;
    }

    @Override
    public String sound() {
        return "rawr i'm akshay";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 15000;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }


}
