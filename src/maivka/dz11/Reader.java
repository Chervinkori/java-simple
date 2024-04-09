package maivka.dz11;

import java.util.Date;

class Reader {
    private String fullName;
    private int readerId;
    private String faculty;
    private Date dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerId, String faculty, Date dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerId = readerId;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " взял книги: ");
        for (String book : bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " (автор: " + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " (автор: " + book.getAuthor() + "), ");
        }
        System.out.println();
    }
}