
import java.util.List;

public interface Financial {

    default double totalCost(List<Item> wishListOfConsumer) {
        double total = 0.0;
        for (Item item : wishListOfConsumer) {
            total += item.getCost();
        }
        return total;
    }

    default boolean moneyCheck(Consumer consumer) {
        if (totalCost(consumer.wishList) > consumer.getMoney()) {
            return false;
        } else {
            return true;
        }
    }

    default void buyingItems(Consumer consumer) {
        if (moneyCheck(consumer)) {
            consumer.setMoney(consumer.getMoney() - totalCost(consumer.wishList));
            for (Item item : consumer.wishList) {
                item.setQuantity(item.getQuantity() - 1); //пока будем считать, что один товар в одни руки))
            }
            consumer.changeIndex(consumer);
            System.out.println("Спасибо за покупку!");
        } else {
            System.out.println("Приходите в следующий раз!");
        }
    }


}
