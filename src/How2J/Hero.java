public class Hero {
    String name;    //姓名
    float hp;   //血量
    float armor;    //护甲
    float moveSpeed;    //移速

    int killed; //被杀次数
    int kill;   //杀人次数
    int support;    //助攻次数
    int money;  //金钱
    int buDao;  //补刀次数
    int attackSpeed;    //攻击速度
    String wordAfterKill;   //击杀后说的话
    String wordAfterKilled; //被击杀后说的话

    //构造方法
    public Hero(String heroName) {
        name = heroName;
    }
    public Hero(String heroName,float heroHp) {
        this(heroName);
        this.hp = heroHp;
    }
    public Hero(String heroName,float heroHp,float heroArmor) {
        this(heroName,heroHp);
        this.armor = heroArmor;
    }
    public Hero(String heroName,float heroHp,float heroArmor,int heroMoveSpeed) {
        this(heroName,heroHp,heroArmor);
        moveSpeed = heroMoveSpeed;
    }
    //超神
    public void legendary() {
        System.out.println(name+"超神了！");
    }
    //超鬼
    public void unlegendary() {
        System.out.println(name+"超鬼了！");
    }
    //获取当前护甲值
    public float getArmor() {
        return armor;
    }
    //获取当前血量
    public float getHp() {
        return hp;
    }
    //获得加速
    public void addSpeed(float temporarySpeed) {
        moveSpeed = moveSpeed + temporarySpeed;
    }
    //回血
    public void recoveryHp(float exterHp) {
        hp = hp + exterHp;
    }
}

