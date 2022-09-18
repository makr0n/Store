public interface DiscountAmount extends Financial {


    default double getStatus(Human human) {
        if (human.getLoveIndex() <= 0) {
            System.out.println("You don't have any discount");
            return Discount.NODISCOUNT.getValue();
        }
        if (human.getLoveIndex() <= 20) {
            System.out.println("You have Bronze status");
            return Discount.BRONZE.getValue();
        } else if (human.getLoveIndex() <= 40) {
            System.out.println("You have Silver status");
            return Discount.SILVER.getValue();
        } else if (human.getLoveIndex() <= 60) {
            System.out.println("You have Gold status");
            return Discount.GOLD.getValue();
        } else if (human.getLoveIndex() <= 80) {
            System.out.println("You have Platinum status");
            return Discount.PLATINUM.getValue();
        } else {
            System.out.println("You have Diamond status");
            return Discount.DIAMOND.getValue();
        }

    }

    default void changeIndex(Human human) {
        human.setLoveIndex(human.getLoveIndex() + 5);
    }

}
