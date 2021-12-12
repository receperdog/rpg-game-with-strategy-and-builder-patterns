package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public class Garment implements ArmorStrategies{
    @Override
    public String getArmor() {
        return "GARMENT";
    }

    @Override
    public int getHealthPoints() {
        return 500;
    }
}
