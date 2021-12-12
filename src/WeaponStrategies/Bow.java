package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Bow implements WeaponStrategies{
    private int attackPower;
    @Override
    public String getWeapon() {
        return "BOW";
    }

    @Override
    public int getAttackPower() {
        attackPower = 100;
        return attackPower;
    }
}
