package exam.ay1920s1.Q3b;

import java.util.Random;

class AccessRight {
    public int verify(String item_id, String action) {
        return new Random().nextInt(4) - 1;
    }
}
