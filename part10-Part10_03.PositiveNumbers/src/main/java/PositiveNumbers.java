
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positives = numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
        //return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
        return positives;
    }
}
