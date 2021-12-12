import ArmorStrategies.Armor;
import WeaponStrategies.Axe;
import WeaponStrategies.Bow;

public class Main {

    public static void main(String[] args) {
        Character playerOne = new Character
                .Builder("playerOne","Male","Turk").description("Player One").build();

        Character playerTwo = new Character.Builder("PlayerTwo", "Female", "USA").build();

        Character abdullah =
                new Character.Builder("akatsuki", "Male", "TURK").skinColor("white").eyeColor(
                        "Brown").description("Adamdır").build();

        Character abdullah2 =
                new Character.Builder("akatsuki", "Male", "TURK").skinColor("white").build();

        System.out.println("Weapon information");
        playerOne.setWeaponStrategies(new Bow());
        System.out.println(playerOne.getWeaponStrategies());
        System.out.println(playerOne.getWeaponAttackPower());

        System.out.println("Armor information");
        playerOne.setArmorStrategies(new Armor());
        System.out.println(playerOne.getArmorStrategies());
        System.out.println(playerOne.getHealthPoint());

        System.out.println("------");
        System.out.println(playerOne.getHealthPoint());
        playerOne.reduceHealthPoint(500);//I Assume player get 500 damage points.
        System.out.println(playerOne.getHealthPoint());//Player health point will be 500;
        System.out.println("------");

        System.out.println("Character information");
        System.out.println(playerOne.getGender());
        System.out.println(playerOne.getNickName());
        System.out.println(playerOne.getOrigin());
        System.out.println(playerOne.getDescription());

    }
}
