package panov.Dz10;

public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Петров В. В.", 8, "МГУ", "15.06.2004", 88005553535L);
        reader1.takeBook(4);
        Reader reader2 = new Reader("Иванов П. П.", 15, "КТиГС", "11.04.1954", 89313175802L);
        reader2.takeBook("Приключения, Словарь, Энциклопедия");
        Reader reader3 = new Reader("Сидоров Д. Д.", 888, "Петра Великого", "27.10.2000", 89876543210L);
        reader3.takeBook(new Book("Гадкий утенок", "Андерсен Х. К."));
        Reader[] array = new Reader[]{reader1, reader2, reader3};

    }

}
