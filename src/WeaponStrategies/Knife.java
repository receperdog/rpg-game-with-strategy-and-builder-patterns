package WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Knife implements WeaponStrategies{
    private int attackPower;
    @Override
    public String getWeapon() {
        return "KNIFE";
    }

    @Override
    public int getAttackPower() {
        attackPower = 70;
        return  attackPower;
    }
}
