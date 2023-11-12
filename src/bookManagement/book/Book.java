package bookManagement.book;

import java.time.LocalDate;

public class Book {
    private Long id;
    private String name;
    private String author;
    private Long isbn;
    private LocalDate publishedDate;

    public Book(Long id, String name, String author, Long isbn, LocalDate publishedDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.publishedDate = publishedDate;
    }

    public Book() {

    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\t"
                + this.id + "\t"
                + this.name + "\t"
                + this.author + "\t"
                + this.isbn + "\t"
                + this.publishedDate;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.author.hashCode() + (int) (Math.sqrt(this.isbn));
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book &&
                this.name.equals(((Book) obj).getName()) &&
                this.author.equals(((Book) obj).getAuthor()) &&
                this.isbn.equals(((Book) obj).getIsbn());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}