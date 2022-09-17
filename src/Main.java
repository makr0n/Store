public class Main {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Mark", 100.0, 36);

        Seller seller = new Seller("Peter", 100.0, 54);

        Item shampoo = new Item("H&S", 14.5, Category.HYGIENE, 10);
        Item sprite = new Item("Sprite", 7.0, Category.WATER, 2);
        Item chicken = new Item("Chicken", 25.0, Category.FOOD, 7);
        Item soap = new Item("Soap", 12.7, Category.HYGIENE, 3);


        consumer1.checkStatus(consumer1);
        seller.isItemsInStorage(shampoo);
        System.out.println(shampoo.getNameOfItem() + " cost " + shampoo.getCost());
        consumer1.walkInStorage(shampoo);
        seller.walkInStorage(soap);
        consumer1.walkInStorage(soap);
        consumer1.walkInStorage(sprite);

        consumer1.buyingItems(consumer1);
        consumer1.checkStatus(consumer1);


    }
}
