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
    private final String eyeColor;
    private final String skinColor;
    private final double height;
    private int healthPoint;
    private ArmorStrategies armorStrategies;
    private WeaponStrategies weaponStrategies;

    private Character(Builder builder){
        this.nickName = builder.nickName;
        this.gender = builder.gender;
        this.origin = builder.origin;
        this.description = builder.description;
        this.eyeColor = builder.eyeColor;
        this.height = builder.height;
        this.skinColor = builder.skinColor;
    }

    //skill
    public String getNickName() {
        return nickName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public double getHeight() {
        return height;
    }

    public String getSkinColor() {
        return skinColor;
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

    public void setArmorStrategies(ArmorStrategies armorStrategies){
        this.armorStrategies = armorStrategies;
    }

    public String getArmorStrategies(){
        return armorStrategies.getArmor();
    }

    public int getHealthPoint(){
        healthPoint = armorStrategies.getHealthPoints();
        return armorStrategies.getHealthPoints();
    }

    public void reduceHealthPoint(int damage){
        armorStrategies.reduceHealthPoints(damage);
        healthPoint = armorStrategies.getHealthPoints();
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
        private String eyeColor;
        private double height;
        private String skinColor;

        public Builder(String nickName, String gender) {
            this.nickName = nickName;
            this.gender = gender;
        }
        public Character build(){
            return new Character(this);
        }

        public Builder origin(String origin){
            this.origin = origin;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder eyeColor(String eyeColor){
            this.eyeColor = eyeColor;
            return this;
        }

        public Builder height(double height){
            this.height = height;
            return this;
        }

        public Builder skinColor(String skinColor){
            this.skinColor = skinColor;
            return this;
        }

    }
}
