package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Dagger implements WeaponStrategies{
    @Override
    public String getWeapon() {
        return "Dagger";
    }

    @Override
    public int getAttackPower() {
        return  80;
    }
}
