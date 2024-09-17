package racing.util;

import java.util.Random;

public class RandomCountGenerator {
    public static int generateRandomNum(){
        return new Random().nextInt(10);
    }
}
