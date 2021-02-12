public enum DiscountType {
    VIP(0.2),
    SECONDVISIT(0.1),
    NONE(0);

    private double type;

    DiscountType(double type) {
        this.type = type;
    }

    public double getType() {
        return type;
    }
}
