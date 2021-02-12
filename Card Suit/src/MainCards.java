import java.util.Scanner;

public class MainCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input + ":");
        for (CardType type: CardType.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",type.ordinal(),
                    type);
        }
    }
}
