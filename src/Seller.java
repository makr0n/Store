
public class Seller extends Human implements Communication, DiscountAmount {

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }


    @Override
    public void walkInStorage(Item item) {
        System.out.println("Я схожу на склад");
        if (item.getQuantity() < 1) {
            System.out.println("Товара нет на складе");
        } else {
            System.out.println("Товар в наличии");
        }

    }
}
