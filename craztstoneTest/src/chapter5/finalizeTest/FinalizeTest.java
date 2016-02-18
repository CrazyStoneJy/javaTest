package chapter5.finalizeTest;

/**
 * Created by crazystone on 2016/1/24.
 */
public class FinalizeTest {

    public static void main(String[] args) {

        Book book1 = new Book(true);
        book1.checkIn();
        Book book2 = new Book(true);
        System.gc();
        $();
    }


    public static void $() {
        String str = "";
    }
}
