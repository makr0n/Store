public class Main {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Mark", 100.0, 27);
        Consumer consumer2 = new Consumer("Jack", 300.0, 99);
        Consumer consumer3 = new Consumer("Jane", 100.0, 69);
        Consumer consumer4 = new Consumer("Shane", 1.0, 0);
        Item shampoo = new Item("H&S", 14.5, Category.Hygiene,10);
        Item sprite = new Item("Sprite", 7.0, Category.Water,2);
        Item chicken = new Item("Chicken", 25.0, Category.Food,7);
        Item soap = new Item("Soap", 12.7, Category.Hygiene,3);


        consumer1.walkInStorage(consumer1,shampoo);




        consumer1.checkStatus(consumer1);
        consumer1.moneyCheck(consumer1);
        consumer2.checkStatus(consumer2);
        consumer3.checkStatus(consumer3);
        consumer4.checkStatus(consumer4);
        consumer4.moneyCheck(consumer4);
    }
}
