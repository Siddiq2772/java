import com.siddiq.shape;
public class Shapeusing {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(30);
        r.setHeight(20);

        System.out.println("volume: "+ r.getVolume()+" area:"+r.getarea());
    }
}
