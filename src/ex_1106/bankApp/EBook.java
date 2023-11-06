package ex_1106.bankApp;
import java.time.LocalDate;

public class EBook extends Book {

    String fileSize;

    @Override
    public String toString() {
        return super.toString() + "\t"
                + fileSize + "mb";
    }

    @Override
    public int hashCode() {
        return "Ebook".hashCode() + super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof EBook &&
                super.equals(obj);
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public Long getIsbn() {
        return super.getIsbn();
    }

    @Override
    public void setIsbn(Long isbn) {
        super.setIsbn(isbn);
    }

    @Override
    public LocalDate getPublishedDate() {
        return super.getPublishedDate();
    }

    @Override
    public void setPublishedDate(LocalDate publishedDate) {
        super.setPublishedDate(publishedDate);
    }

    public EBook(Long id, String name, String author, Long isbn, LocalDate publishedDate, String fileSize) {
        super(id, name, author, isbn, publishedDate);
        this.fileSize = fileSize;
    }
}
