package panov.Dz10;

/*
1. Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
1.1. ФИО,
1.2. номер читательского билета,
1.3. факультет,
1.4. дата рождения,
1.5. телефон.
1.6. Методы takeBook(), returnBook().
1.7. Разработать программу, в которой создается массив объектов данного класса.
1.8. Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
1.9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */

import java.util.Arrays;

public class Reader {
    private String fullName;
    private int numberLibraryCard;
    private String faculty;
    private String dateOfBirth;
    private long phoneNumber;

    public Reader(String fullName, int numberLibraryCard, String faculty, String dateOfBirth, long phoneNumber) {
        this.fullName = fullName;
        this.numberLibraryCard = numberLibraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", numberLibraryCard=" + numberLibraryCard +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberLibraryCard() {
        return numberLibraryCard;
    }

    public void setNumberLibraryCard(int numberLibraryCard) {
        this.numberLibraryCard = numberLibraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {

    }

    public void returnBook() {

    }

    public void takeBook(int count) {
        System.out.println(getFullName() + " взял " + count + " книги");
    }

    public void takeBook(String nameBook) {
        System.out.println(getFullName() + " взял " + "книги: " + nameBook);
    }

    public void takeBook(Book books) {
        System.out.println(getFullName() + " взял " + "книги: " + books.getName() + " " + books.getAuthor());
    }

    public void returnBook(int count) {
        System.out.println(getFullName() + " вернул " + count + " книги");
    }
}