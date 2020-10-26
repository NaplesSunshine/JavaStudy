public class test20200903 {
    public static void main(String args[]) {
        Hero hero1 = new Hero();
        hero1.name = "盖伦";
        hero1.hp = 500;
        hero1.armor = 150;
        hero1.moveSpeed = 85;

        System.out.println(hero1.name+"当前血量是"+hero1.hp);
        System.out.println("吃血瓶");
        hero1.recoveryHp(100);
        System.out.println(hero1.name+"当前血量是"+hero1.hp);
    }
}
