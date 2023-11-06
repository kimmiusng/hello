package ex_1106.bankApp;

public class Execute {
    static BookManager bm = new BM4();
    public static void main(String[] args) {
        bm.init();
        bm.interactWithUser();
    }
}