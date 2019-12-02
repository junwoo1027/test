import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private static final int MAX_NUM = 9;
    private static final int ONE = 1;
    private static final int BALL_LEN = 3;

    private List<Integer> computer = new ArrayList<>(BALL_LEN);

    Computer() {
        Random random;
        int temp;

        while(computer.size() < BALL_LEN) {
            random = new Random();
            temp = random.nextInt(MAX_NUM) + ONE;
            if(!computer.contains(temp)) {
                computer.add(temp);
            }

        }
    }
}