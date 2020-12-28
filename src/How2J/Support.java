public class Support extends Hero{
    public void heal () {
        System.out.println("对自己进行治疗");
    }
    //为指定英雄加血
    public void heal (Hero hero) {
        System.out.println("给英雄 " + hero + "加血");
    }
    //为指定的英雄加了hp的血
    public void heal (Hero hero,int hp) {
        System.out.println("给英雄 " + hero + "加了" + hp + "血");
    }
}