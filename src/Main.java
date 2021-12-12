import ArmorStrategies.Armor;
import WeaponStrategies.Axe;
import WeaponStrategies.Bow;

public class Main {

    public static void main(String[] args) {
        Character PlayerOne = new Character
                .Builder("PlayerOne","Male","Turk").description("Player One").build();

        System.out.println("Weapon information");
        PlayerOne.setWeaponStrategies(new Bow());
        System.out.println(PlayerOne.getWeaponStrategies());
        System.out.println(PlayerOne.getWeaponAttackPower());

        System.out.println("Armor information");
        PlayerOne.setArmorStrategies(new Armor());
        System.out.println(PlayerOne.getArmorStrategies());
        System.out.println(PlayerOne.getHealthPoint());

        System.out.println("Character information");
        System.out.println(PlayerOne.getGender());
        System.out.println(PlayerOne.getNickName());
        System.out.println(PlayerOne.getOrigin());
        System.out.println(PlayerOne.getDescription());

    }
}
