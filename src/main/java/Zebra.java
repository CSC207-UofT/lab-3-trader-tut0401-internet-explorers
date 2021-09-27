/* Another sample class that implements the given interfaces.
 */

public class Zebra implements Tradable, Domesticatable {
    @Override
    public String sound() {
        return "wouuh wouuuwah whouuuuwouh wouHIIII";
    }

    @Override
    public int getPrice() {
        return Integer.MAX_VALUE;
    }
}
