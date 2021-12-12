package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Sword implements WeaponStrategies{
    private int attackPower;
    @Override
    public String getWeapon() {
        return "SWORD";
    }

    @Override
    public int getAttackPower() {
        attackPower = 90;
        return attackPower;
    }
}
