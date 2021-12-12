package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Bow implements WeaponStrategies{
    @Override
    public String getWeapon() {
        return "Bow";
    }

    @Override
    public int getAttackPower() {
        return 100;
    }
}
