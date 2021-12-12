package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Knife implements WeaponStrategies{
    @Override
    public String getWeapon() {
        return "Knife";
    }

    @Override
    public int getAttackPower() {
        return  70;
    }
}
