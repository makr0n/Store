public interface Communication {
    default void isItemsInStorage(Item item) {
        if (item.getQuantity() == 0) {
            System.out.println("У нас нет " + item.getNameOfItem());
        } else {
            System.out.println(item.getNameOfItem() + " availaible");
        }
    }

    void walkInStorage(Item item);


}
