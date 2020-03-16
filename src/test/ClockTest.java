import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;

class ClockTest {

    public static void main(String[] args) {
        final Clock clock = new Clock();
        final String start = clock.toString();
        for (int i = 0; i < 720; i++) {
            clock.next();
        }
        Assert.assertThat("Checking that + 720 minutes gives the same time.", clock.toString(),
            is(start));
        System.out.println("Test ok!");
    }
}
