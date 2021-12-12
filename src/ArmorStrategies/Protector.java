package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public class Protector implements ArmorStrategies{
    @Override
    public String getArmor() {
        return "PROTECTOR";
    }

    @Override
    public int getHealthPoints() {
        return 800;
    }
}
