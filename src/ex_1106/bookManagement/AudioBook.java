package ex_1106.bookManagement;

import java.time.LocalDate;

public class AudioBook extends Book {

    String fileSize;
    String language;
    int playTime;

    @Override
    public String toString() {
        return super.toString() + "\t"
                + fileSize + "mb"
                + language + "\t"
                + playTime + "초";
    }

    @Override
    public int hashCode() {
        return "Audiobook".hashCode() + super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AudioBook && super.equals(obj);
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
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

    public AudioBook(Long id, String name, String author, Long isbn, LocalDate publishedDate, String fileSize, String language, int playTime) {
        super(id, name, author, isbn, publishedDate);
        this.fileSize = fileSize;
        this.language = language;
        this.playTime = playTime;
    }
}


