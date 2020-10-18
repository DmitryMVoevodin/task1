import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String[] authors;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private String bindingType;

    public Book() {
    }

    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String title, String[] authors, String publishingHouse, int year, int pages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                pages == book.pages &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Arrays.equals(authors, book.authors) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, title, publishingHouse, year, pages, price, bindingType);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
