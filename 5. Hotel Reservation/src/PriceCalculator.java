public class PriceCalculator {
    private double pricePerDay;
    private int numDays;
   private Seasons seasons;
   private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numDays, Seasons seasons, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numDays = numDays;
        this.seasons = seasons;
        this.discountType = discountType;
    }
    public  double calculatePrice(){

        double current = this.numDays * this.pricePerDay * this.seasons.getSeason();
        return  current - (current * this.discountType.getType());
    }
}
