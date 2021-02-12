import java.util.*;

public class GreedyTimesMain {
    static long capacity = 0;
    static Map<String, List<BagPack>> output = new LinkedHashMap<>();
    static long gold = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = scanner.nextLong();
        scanner.nextLine();
        String[] input = scanner.nextLine().split("\\s+");

         BagPack bagPack = new BagPack(bagCapacity);
        for (int i = 0; i < input.length; i += 2) {
            String name = input[i];
            long quantity = Long.parseLong(input[i + 1]);
            if (name.length() == 3){
                bagPack.addCash(name, quantity);
            }else if (name.toLowerCase().endsWith("gem")){
                bagPack.addGems(name, quantity);
            }else if (name.toLowerCase().equals("gold")){
                bagPack.addGold(quantity);
            }
        }
        System.out.println(bagPack);
    }

}
