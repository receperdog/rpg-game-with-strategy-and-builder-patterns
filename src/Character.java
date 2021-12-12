import ArmorStrategies.ArmorStrategies;
import WeaponStrategies.WeaponStrategies;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 09-Dec-21, Thu
 **/
public class Character {
    private final String nickName;
    private final String gender;
    private final String origin;
    private final String description;
    private ArmorStrategies armorStrategies;
    private WeaponStrategies weaponStrategies;

    private Character(Builder builder){
        this.nickName = builder.nickName;
        this.gender = builder.gender;
        this.origin = builder.origin;
        this.description = builder.description;
    }

    public String getNickName() {
        return nickName;
    }

    public String getDescription() {
        return description;
    }

    public String getGender() {
        return gender;
    }

    public String getOrigin() {
        return origin;
    }

    /*
     public WeaponStrategies getWeaponStrategies() {
        return weaponStrategies;
    }
    */
    public void setArmorStrategies(ArmorStrategies armorStrategies){
        this.armorStrategies = armorStrategies;
    }

    public String getArmorStrategies(){
        return armorStrategies.getArmor();
    }

    public int getHealthPoint(){
        return armorStrategies.getHealthPoints();
    }


    public void setWeaponStrategies(WeaponStrategies weaponStrategies) {
        this.weaponStrategies = weaponStrategies;
    }

    public String getWeaponStrategies(){
        return weaponStrategies.getWeapon();
    }

    public int getWeaponAttackPower(){
        return weaponStrategies.getAttackPower();
    }

    public static class Builder{
        private String nickName;
        private String gender;
        private String origin;
        private String description;


        public Builder(String nickName, String gender, String origin) {
            this.nickName = nickName;
            this.gender = gender;
            this.origin = origin;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Character build(){
            return new Character(this);
        }
    }
}
