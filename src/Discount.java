public enum Discount {
    NODISCOUNT(1.0),
    BRONZE(0.90),
    SILVER(0.85),
    GOLD(0.80),
    PLATINUM(0.75),
    DIAMOND(0.70);

    private Double value;

    Discount(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
