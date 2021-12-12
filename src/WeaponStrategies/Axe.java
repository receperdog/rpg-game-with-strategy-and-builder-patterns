package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Axe implements WeaponStrategies{
    private int attackPower;
    @Override
    public String getWeapon() {
        return "AXE";
    }

    @Override
    public int getAttackPower() {
        attackPower = 95;
        return attackPower;
    }
}
