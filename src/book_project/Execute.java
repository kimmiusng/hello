package book_project;

import java.time.LocalDate;
import java.util.Scanner;

public class Execute {

    static Scanner sc = new Scanner(System.in);
    static BM bm = new BM();

    public static void main(String[] args) {


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
                    //조회
                    printAllBook();
                    break;
                case "2":
                    // 등록
                    addBook();
                    break;
                case "3":
                    //수정
                    updateBook();
                case "4":
                    //삭제
                    removeBook();
                case "q":
                    System.out.println("프로그램 종료!");
                    return; // 메소드를 종료


            }
        }
    }

    private static void removeBook() {
        //삭제 메서드 실행
        System.out.print("삭제하고자 하는 도서번호를 입력해주세요 : ");
        long id = Long.parseLong(sc.nextLine());
        if(bm.searchBookIndex(id) == -1){
            System.out.println("해당 도서가 존재하지 않습니다.");
        } else {
            Book book = bm.searchBook(id);
            bm.removeBook(book);
            System.out.println("삭제가 완료 되었습니다.");
        }
    }

    private static void updateBook() {
        //수정 메서드 실행
        System.out.print("수정할 도서 번호를 입력해주세요 : ");
        long id = Long.parseLong(sc.nextLine());
        if (bm.searchBookIndex(id) == -1) {
            System.out.println("해당 도서가 존재하지 않습니다.");
        } else {
            System.out.print("id: ");
            String id = sc.nextLine();
            System.out.print("제목: ");
            String name = sc.nextLine();
            System.out.print("isbn: ");
            String isbn = sc.nextLine();
            System.out.print("출판일(YYYY-MM-DD): ");
            String publishDate = sc.nextLine();

        }
    }


    private static void addBook() {
        // 1. 콘솔화면을 통해 사용자로부터 도서정보를 입력을 받는다.
        // id, 제목, 저자, isbn, 출판일 (5가지) (v)
        // 위의 정보로 책 객체를 생성한다. (v)
        // 2. 도서를 등록한다.
        // 사서를 통해 도서 저장 요청




        // id, isbn는 String 타입이므로 Long으로 변환 후 매개값을 주어야한다.
        // publishedDate는 String 타입인데 LocalDate 타입으로 변환해주어야 한다. ==> "구글링"
        Book book = new Book(Long.parseLong(id),
                name,
                author,
                Long.parseLong(isbn),
                LocalDate.parse(publishDate));


        bm.addBook(book);
        System.out.println("--- 도서 ["+book.getName()+"] 등록이 완료되었습니다.");


        private static void printAllBook() {
            bm.printAllBook();
        }


    }
}






