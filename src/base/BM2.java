package base;

import ex_1031.Audio;
import ex_1031.quiz.Soundable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BM2 extends BookManager {

    private ArrayList<Book> bookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    @Override
    void init() {
        bookList.add(new Book(1L, "돈의 속성(300쇄 리커버에디션)", "김승호", Long.parseLong("9791188331796"), LocalDate.parse("2020-06-15")));
        bookList.add(new Book(2L, "K 배터리 레볼루션", "박순혁", Long.parseLong("9791191521221"), LocalDate.parse("2023-02-20")));
        bookList.add(new Book(3L, "위기의 역사", "오건영", Long.parseLong("9791169850360"), LocalDate.parse("2023-07-19")));

    }

    @Override
    void interactWithUser() {
        while (true) {
            System.out.println("■■■■■■ 도서 관리 프로그램 ■■■■■■");
            System.out.println("(1) 도서 조회");
            System.out.println("(2) 도서 등록");
            System.out.println("(3) 도서 수정");
            System.out.println("(4) 도서 삭제");
            System.out.println("(q) 프로그램 종료");
            System.out.print("선택 >> ");
            String userInput = sc.nextLine();

            switch (userInput) {
                case "1":
                    // 조회
                    printAllBook();
                    break;
                case "2":
                    // 등록
                    addBook();
                    break;
                case "3":
                    // 수정
                    updateBook();
                    break;
                case "4":
                    // 삭제
                    removeBook();
                    break;
                case "q":
                    // 메소드를 종료
                    System.out.println("프로그램 종료!");
                    return;
            }

        }
    }


    @Override
    void addBook() {
        //System.out.println("등록 메서드 실행");
        // 1. 콘솔화면을 통해 사용자로부터 도서정보를 입력을 받는다.
        // id, 제목, 저자, isbn, 출판일 (5가지) (v)
        // 위의 정보로 책 객체를 생성한다. (v)
        // 2. 도서를 등록한다.
        // 사서를 통해 도서 저장 요청

        String[] bookInfo = new String[8];

        System.out.println("등록할 책의 종류를 선택해주세요.");
        System.out.println("(1)Book");
        System.out.println("(2)EBook");
        System.out.println("(3)AudioBook");
        System.out.print(">> ");
        String bookType = sc.nextLine();

        System.out.print("id: ");
        bookInfo[0] = sc.nextLine();
        System.out.print("제목: ");
        bookInfo[1] = sc.nextLine();
        System.out.print("저자: ");
        bookInfo[2] = sc.nextLine();
        System.out.print("isbn: ");
        bookInfo[3] = sc.nextLine();
        System.out.print("출판일(YYYY-MM-DD): ");
        bookInfo[4] = sc.nextLine();
        if (Integer.parseInt(bookType) == 2) {
            System.out.print("파일크기(mb): ");
            bookInfo[5] = sc.nextLine();
        } else if (Integer.parseInt(bookType) == 3) {
            System.out.print("파일크기(mb): ");
            bookInfo[5] = sc.nextLine();
            System.out.print("재생언어: ");
            bookInfo[6] = sc.nextLine();
            System.out.print("재생시간(초): ");
            bookInfo[7] = sc.nextLine();
        }


        // book을 저장소에 저장
        Book book;
        if (Integer.parseInt(bookType) == 1) {
            book = new Book(Long.parseLong(bookInfo[0]),
                    bookInfo[1],
                    bookInfo[2],
                    Long.parseLong(bookInfo[3]),
                    LocalDate.parse(bookInfo[4]));
            bookList.add(book);
        } else if (Integer.parseInt(bookType) == 2) {
            book = new Ebook((Long.parseLong(bookInfo[0]),
                    bookInfo[1],
                    bookInfo[2],
                    Long.parseLong(bookInfo[3]),
                    LocalDate.parse(bookInfo[4]),
                    bookInfo[5]);
            bookList.add(book);
        } else if (Integer.parseInt(bookType) == 3) {
            book = new AudioBook((Long.parseLong(bookInfo[0]),
                    bookInfo[1],
                    bookInfo[2],
                    Long.parseLong(bookInfo[3]),
                    LocalDate.parse(bookInfo[4]),
                    bookInfo[5],
                    bookInfo[6],
                    Integer.parseInt(bookInfo[7]));
            bookList.add(book);
        } else {
            System.out.println("책 형식 입력이 잘못 되었습니다.");

        }


        @Override
        void printAllBook () {
            for (Book book : bookList) {
                System.out.print("[");

                if (book instanceof Ebook) {
                    System.out.print("Ebook, ");
                } else if (book instanceof AudioBook) {
                    System.out.print("AudioBook, ");
                } else {
                    System.out.println("Book, ");
                }

                System.out.print(book.getId());
                System.out.print(", ");
                System.out.print(book.getName());
                System.out.print(", ");
                System.out.print(book.getAuthor());
                System.out.print(", ");
                System.out.print(book.getIsbn());
                System.out.print(", ");
                System.out.print(book.getPublishedDate());

                if (book instanceof Ebook) {
                    System.out.print(", ");
                    System.out.print(((Ebook)book).getFileSize() + "mb");
                } else if (book instanceof AudioBook){
                    System.out.print(", ");
                    System.out.print((((AudioBook) book).getFileSize()) + "mb");
                    System.out.print(((AudioBook) book).getLanguage());
                    System.out.println(((AudioBook)book).getPlayTime() + "초";

                System.out.print("]");
                System.out.println();
            }

        }

    }

    @Override
    void updateBook() {

    }

    @Override
    void removeBook() {

    }
}
