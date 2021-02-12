import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2];
        String discount = input[3];

        Seasons seasons = Seasons.valueOf(season.toUpperCase());
        DiscountType discountType = DiscountType.valueOf(discount.toUpperCase());

        PriceCalculator priceCalculator = new PriceCalculator(price, days, seasons, discountType);
        System.out.printf("%.2f", priceCalculator.calculatePrice());

    }
}
