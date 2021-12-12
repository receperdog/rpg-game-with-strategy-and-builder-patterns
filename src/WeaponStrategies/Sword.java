package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Sword implements WeaponStrategies{
    @Override
    public String getWeapon() {
        return "Sword";
    }

    @Override
    public int getAttackPower() {
        return  90;
    }
}
