package lab14;

public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private int year;

    public Book(String ISBN, String title, String authorName, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public Book() {
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ISBN = " + ISBN +
                ", Title = " + title +
                ", AuthorName = " + authorName +
                ", Year = " + year;
    }
}
