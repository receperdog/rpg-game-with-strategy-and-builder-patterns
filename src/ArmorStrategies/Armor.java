package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public class Armor implements ArmorStrategies{
    private int healthPoint = 1000;
    @Override
    public String getArmor() {
        return "ARMOR";
    }

    @Override
    public int getHealthPoints() {
        return healthPoint;
    }

    @Override
    public void reduceHealthPoints(int damage) {
        healthPoint -= damage;
    }
}
