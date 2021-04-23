
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random number = new Random();
        
        System.out.println("How many numbers should be printed?");
        int toPrint = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < toPrint; i++){
            System.out.println(number.nextInt(11));
        }
    }

}
