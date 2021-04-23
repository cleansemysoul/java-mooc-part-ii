
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(input));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers ? (n/p)");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("n")) {
                System.out.println("Average of the negative numbers: " + inputs.stream().filter(i -> i < 0).mapToInt(i -> i).average().getAsDouble());
                break;
            }
            if (input.equals("p")) {
                System.out.println("Average of the positive numbers: " + inputs.stream().filter(i -> i > 0).mapToInt(i -> i).average().getAsDouble());
                break;
            }
        }
    }
}
