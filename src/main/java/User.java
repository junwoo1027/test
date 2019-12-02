import java.util.Scanner;

public class User {

    private static final char START_WORD = '1';

    private static final char END_WORD = '9';

    private static final int BALL_LEN = 3;

    private String number = "";

    void requestNumber() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("서로 다른 3자리의 수를 입력하세요 : ");
            number = scan.next();

            if (checkLen() && checkNum() && checkDuplicate()) {
                break;
            }
        }
    }

    private boolean checkLen() {
    }


    private boolean checkNum() {
    }

    private boolean checkDuplicate() {
    }
}

