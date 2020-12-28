public class test20201228 {

    public void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65; //damage属性在类Weapon中新设计的

        infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
        infinityEdge.price = 3600;

        Armor cloth = new Armor();
        cloth.name="布甲";
        cloth.price=300;
        cloth.ac = 15;

        Armor chainMail = new Armor();
        chainMail.name="锁子甲";
        chainMail.price=500;
        chainMail.ac = 40;
    }
}
