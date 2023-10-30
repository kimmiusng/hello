package book_project;

import java.util.ArrayList;

//BookManager를 구현하는 구현 객체
public class BM extends BookManger {

    private ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public void printAllBook() {
        for (Book book : bookList){
            System.out.print("[");
            System.out.print(book.getId());
            System.out.print("." + book.getName());
            System.out.print(" / ");
            System.out.print(book.getName());
            System.out.print(" / ");
            System.out.print(book.getIsbn());
            System.out.print(" / ");
            System.out.print(book.getPublishedDate());
            System.out.print("]");
            System.out.println();
        }
    }

    public int searchBookIndex(long index){
        Book book = new Book();
        int search = -1;
        for (int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getId() == index){
                search = i;
            }
        }
        return search;
    }

    public Book searchBook(long index){
        Book book = new Book();
        int search = -1;
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getId() == index){
                book = bookList.get(i);
            }
        }
        return book;
    }



    @Override
    void updateBook(Book book) {
        bookList.set(searchBookIndex(book.getId()),book);

    }

    @Override
    void removeBook(Book book) {
        bookList.remove(searchBookIndex(book.getId()));


    }
}
