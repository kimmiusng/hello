package bookManagement.bm;

import bookManagement.bm.BM2;
import bookManagement.bm.BookManager;

public class Execute {
    static BookManager bm = new BM2();
    public static void main(String[] args) {

        bm.init();
        bm.interactWithUser();

    }
}
