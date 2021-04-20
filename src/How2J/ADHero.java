public class ADHero extends Hero{
    public ADHero(String heroName) {
        super(heroName);
    }

    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
    public void attack(Hero hero1) {
        System.out.println(name + "对" + hero1.name + "进行了一次攻击 ");
    }
    public void attack(Hero hero1, Hero hero2) {
        System.out.println(name + "同时对" + hero1.name + "和" + hero2.name + "进行了攻击 ");
    }
    public void attack(Hero ... heros) {
        for (Hero h : heros) {
            System.out.println(name + "同时对" + h.name + "进行了攻击 ");
        }
    }

}
