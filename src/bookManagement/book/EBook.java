package bookManagement.book;

import java.time.LocalDate;

public class EBook extends Book {

    String fileSize;

    public EBook(Long id, String name, String author, Long isbn, LocalDate publishedDate, String fileSize) {
        super(id, name, author, isbn, publishedDate);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\t"
                + fileSize + "mb";
    }

    @Override
    public int hashCode() {
        return "EBook".hashCode() + super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book && super.equals(obj);
    }

    public EBook(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}
