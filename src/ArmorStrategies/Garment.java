package ArmorStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 12-Dec-21, Sun
 **/
public class Garment implements ArmorStrategies{
    private int healthPoint = 500;

    @Override
    public String getArmor() {
        return "GARMENT";
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
