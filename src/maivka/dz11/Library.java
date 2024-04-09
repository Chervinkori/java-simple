package maivka.dz11;

import java.util.Date;
public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Маивка Н. В.", 12345, "Математика", new Date(), "123-456-789");

        // Примеры использования перегруженных методов takeBook() и returnBook()
        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));
    }
}
