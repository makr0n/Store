public interface DiscountAmount extends Financial {


    default void checkStatus(Human human) {
        if (human.getLoveIndex() <= 0) {
            System.out.println("You don't have any discount");
        }
        if (human.getLoveIndex() <= 20) {
            System.out.println("You have " + Discount.Bronze + " status");
        } else if (human.getLoveIndex() <= 40) {
            System.out.println("You have " + Discount.Silver + " status");
        } else if (human.getLoveIndex() <= 60) {
            System.out.println("You have " + Discount.Gold + " status");
        } else if (human.getLoveIndex() <= 80) {
            System.out.println("You have " + Discount.Platinum + " status");
        } else {
            System.out.println("You have " + Discount.Diamond + " status");
        }

    }

    default void changeIndex(Human human) {
        human.setLoveIndex(human.getLoveIndex() + 5);
    }

}
