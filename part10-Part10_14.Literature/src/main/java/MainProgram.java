
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println(book.size() + " books in total.");
                System.out.println("Books:");
                Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                        .thenComparing(Book::getName);
                Collections.sort(book, comparator);
                book.stream().forEach(Book -> System.out.println(Book));
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            book.add(new Book(name, age));
        }

    }

}
