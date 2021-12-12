package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public class Armor implements ArmorStrategies{
    @Override
    public String getArmor() {
        return "ARMOR";
    }

    @Override
    public int getHealthPoints() {
        return 1000;
    }
}
