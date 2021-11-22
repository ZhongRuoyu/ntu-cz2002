package exam.ay1920s1.Q3b;

import java.util.Random;

class Account {
    public AccessRight[] getRights() {
        AccessRight[] ars = new AccessRight[new Random().nextInt(3) + 1];
        for (int i = 0; i < ars.length; ++i) {
            ars[i] = new AccessRight();
        }
        return ars;
    }
}
