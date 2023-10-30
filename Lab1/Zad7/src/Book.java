import java.util.Objects;

public class Book {
    private String authorName;
    private String authorSurname;
    private String title;
    private Integer ISBNnumber;

    public Book (Integer ISBNnumber, String title, String authorName, String authorSurname){
        this.ISBNnumber = ISBNnumber;
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public Integer getISBNnumber() {
        return ISBNnumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBNnumber, book.ISBNnumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBNnumber);
    }
}
