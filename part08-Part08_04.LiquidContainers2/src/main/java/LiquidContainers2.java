
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        Container second = new Container();
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + container);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                container.add(amount);
            }
            if (command.equals("move")) {
                if (amount > 0) {
                    if (container.contains() - amount < 0) {
                        second.add(container.contains());
                        container.remove(amount);
                        if (second.contains() > 100) {
                            second.add(amount);
                        }
                        continue;
                    }
                    container.remove(amount);
                    second.add(amount);
                }
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }

}
