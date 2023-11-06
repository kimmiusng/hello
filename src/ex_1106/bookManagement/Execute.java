package ex_1106.bookManagement;

public class Execute {
    static BookManager bm = new BM5();
    public static void main(String[] args) {
        bm.init();
        bm.interactWithUser();
    }
}