package tp.books;

public class Book {

    private int tomeN;
    private String title;
    private String description;

    public Book(int tomeN, String title, String description) {
        this.tomeN = tomeN;
        this.title = title;
        this.description = description;
    }

    public int getTomeN() {
        return tomeN;
    }

    public void setTomeN(int tomeN) {
        this.tomeN = tomeN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tomeN=" + tomeN +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
