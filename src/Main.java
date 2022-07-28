public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss(200,70);
    boss.weapon.setNameWeapon("MP-5");
    boss.weapon.setTypeWeapon("fire");
        System.out.println(boss.info());
    }
}