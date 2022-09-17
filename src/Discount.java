public enum Discount {
    //TODO надо переписать значения на интовые
    Bronze("0.10"),
    Silver("0.15"),
    Gold("0.20"),
    Platinum("0.25"),
    Diamond("0.30");

    private final String  discount;

    Discount(String discount) {
        this.discount = discount;
    }

    public String getDiscount() {
        return discount;
    }


}
