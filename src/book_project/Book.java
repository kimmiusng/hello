package book_project;

import java.time.LocalDate;

public class Book {
    private Long id; // 식별용 필드 (유일해야함)
    private String name; // 도서명
    private String author; // 저자
    private Long isbn; // isbn 책의 고유번호
    private LocalDate publishedDate; // 출간일



    public Book(Long id, String name, String author, Long isbn, LocalDate publishedDate){
        this.id = id;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.publishedDate = publishedDate;
    }

    public Book(){

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
