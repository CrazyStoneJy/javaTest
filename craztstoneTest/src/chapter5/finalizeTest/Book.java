package chapter5.finalizeTest;

/**
 * Created by crazystone on 2016/1/24.
 */
public class Book {

    private boolean isCheck = false;

    public Book(boolean isCheck) {
        this.isCheck = isCheck;
    }

    public void checkIn() {
        this.isCheck = false;
    }


    @Override
    protected void finalize() {

        if (isCheck) {
            System.out.print(">>>>>>>>>>>>null");
        } else {
            System.out.println(">>>>>>>>>>>>check in");
        }
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
