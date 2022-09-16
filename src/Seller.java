import java.util.ArrayList;
import java.util.List;

public class Seller extends Human{
    private List<Item> items = new ArrayList<>();

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public void walkInStorage(Human human, Item item) {
        System.out.println("Я схожу на склад");
        if (item.getQuantity() < 1) {
            System.out.println("Item is not available");
        } else {
            item.setQuantity(item.getQuantity() - 1);
        }




    }
}
