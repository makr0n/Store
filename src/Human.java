public abstract class Human {
    private String name;
    private double money;
    private int loveIndex;

    public Human(String name, double money, int loveIndex) {
        this.name = name;
        this.money = money;
        this.loveIndex = loveIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getLoveIndex() {
        return loveIndex;
    }

    public void setLoveIndex(int loveIndex) {
        this.loveIndex = loveIndex;
    }

}
