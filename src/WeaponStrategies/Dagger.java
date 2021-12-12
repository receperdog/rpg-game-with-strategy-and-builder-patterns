package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Dagger implements WeaponStrategies{
    private int attackPower;
    @Override
    public String getWeapon() {
        return "DAGGER";
    }

    @Override
    public int getAttackPower() {
        attackPower = 80;
        return  attackPower;
    }

}
