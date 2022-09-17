import java.util.ArrayList;

public class Consumer extends Human implements Communication, Financial, DiscountAmount {
    ArrayList<Item> wishList = new ArrayList<>();
    //TODO Нужно добавить количество покупаемого товара в список покупок, нужен будет MAP

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    @Override
    public void walkInStorage(Item item) {
        wishList.add(item);
        System.out.println(item.getNameOfItem() + " added to wishlist");
    }
}
