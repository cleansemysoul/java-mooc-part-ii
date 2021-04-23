
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        double numbers = inputs.stream().mapToInt(e -> Integer.valueOf(e)).average().getAsDouble();
        System.out.println("average of the numbers: " + numbers);
    }
}
