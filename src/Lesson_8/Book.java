package Lesson_8;

public class Book {

    String title;
    int publicationYear;
    Author author;


    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", author=" + author +
                '}';
    }
}
