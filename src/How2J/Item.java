public class Item {
    String name;    //物品名称
    int price;  //物品价格

    public Item(String ItemName,int ItemPrice) {
        name = ItemName;
        price = ItemPrice;
    }
    public void Checkprice() {
        System.out.println(name + "的价格是" + price);
    }
    public static void main(String[] args) {
        Item Bloodbottle = new Item("血瓶",50);
        Item Strawsandals = new Item("草鞋",300);
        Item Longsword = new Item("长剑",350);
        Bloodbottle.Checkprice();
        Strawsandals.Checkprice();
        Longsword.Checkprice();
    }
}
