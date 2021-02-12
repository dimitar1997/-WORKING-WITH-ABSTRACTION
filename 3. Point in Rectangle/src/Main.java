import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] points = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();



        Point bottomLeft = new Point(points[0],points[1]);
        Point topRight = new Point(points[2], points[3]);


        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());

        while (--n >= 0){
            int[] checkPoints = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            System.out.println(rectangle.contains(checkPoints[0], checkPoints[1]));
        }

    }
}
