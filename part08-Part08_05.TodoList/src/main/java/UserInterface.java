
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserInterface {

    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks,Scanner scanner) {
        this.scanner = scanner;
        this.tasks = tasks;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                String task = scanner.nextLine();
                tasks.add(task);
            }
            if (input.equals("list")) {
                tasks.print();
            }
            if (input.equals("remove")) {
                int number = Integer.valueOf(scanner.nextLine());
                tasks.remove(number);
            }
        }
    }
}
