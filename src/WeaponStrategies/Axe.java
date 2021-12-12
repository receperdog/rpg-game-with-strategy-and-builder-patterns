package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Axe implements WeaponStrategies{
    @Override
    public String getWeapon() {
        return "Axe";
    }

    @Override
    public int getAttackPower() {
        return 95;
    }
}
