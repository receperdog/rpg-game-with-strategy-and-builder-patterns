package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public class Protector implements ArmorStrategies{
    private int healthPoint = 800;

    @Override
    public String getArmor() {
        return "PROTECTOR";
    }

    @Override
    public int getHealthPoints() {
        return healthPoint;
    }

    @Override
    public void setHealthPoints(int damage) {
        healthPoint -= damage;
    }
}
