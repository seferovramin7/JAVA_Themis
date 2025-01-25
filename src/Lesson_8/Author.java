package Lesson_8;

public class Author {

    String name;
    String surname;
    int birthYear;
    int bookCount;

    public Author(String name, String surname, int birthYear, int bookCount) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.bookCount = bookCount;
    }

    boolean isEmekdar(boolean icaze) {
        if (bookCount > 100 && icaze == true) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
