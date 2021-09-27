public class Roylin implements Drivable, Domesticatable, Tradable {
    private int studySpeed;

    public Roylin() {
        this.studySpeed = 1;
    }

    @Override
    public String sound() {
        return "YESSSS I 4.0 this test!"
    }

    @Override
    public void upgradeSpeed() {
        this.studySpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.studySpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return 10;
    }


    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Study speed: " + this.studySpeed +")";
    }
}
