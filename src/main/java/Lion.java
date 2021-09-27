public class Lion implements Drivable, Domesticatable, Tradable{

    private int maxSpeed;
    private String favFood;

    public Lion() {
        this.maxSpeed = 10;
        this.favFood = "Andy";
    }

    @Override
    public String sound() {
        return "ROAAARRRR";
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String gEtfAvFoOd() { return this.favFood; }
}
