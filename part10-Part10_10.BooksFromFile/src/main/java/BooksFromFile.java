
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> book = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(e -> new Book(e[0], Integer.valueOf(e[1]), Integer.valueOf(e[2]), e[3]))
                    .forEach(e -> book.add(e));
            return book;
        } catch (IOException ex) {
            Logger.getLogger(BooksFromFile.class.getName()).log(Level.SEVERE, null, ex);
            return book;
        }
    }
}
