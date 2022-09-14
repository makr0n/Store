public class Item {
    private String nameOfItem;
    private double cost;
    private Category category;
    private int quantity;

    public Item(String nameOfItem, double cost, Category category, int quantity) {
        this.nameOfItem = nameOfItem;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
