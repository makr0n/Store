import java.util.List;

public interface Communication {

    default double costOfItem(Item item) {
        return item.getCost();
    }

    default void isItemsInStorage(Seller seller, List<Item> wishListOfConsumer) {
        for (Item item : wishListOfConsumer) {
            if (!seller.getItems().contains(item)) {
                System.out.println("У нас нет " + item.getNameOfItem());
            }
        }
    }

    default double totalCost(List<Item> wishListOfConsumer) {
        double total = 0.0;
        for (Item item : wishListOfConsumer) {
            total += item.getCost();
        }
        return total;
    }

    default void moneyCheck(Consumer consumer) {
        if (totalCost(consumer.wishList) > consumer.getMoney()) {
            System.out.println("Ты нищеброд, закрой дверь снаружи");
        } else {
            walkInStorage();
        }
    }


    //У Покупателя и Продавца реализовать свои вариации метода "пойти на склад"
    void walkInStorage();
}
