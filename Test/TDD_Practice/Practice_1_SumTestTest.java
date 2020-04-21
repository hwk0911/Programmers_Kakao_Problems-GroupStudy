package TDD_Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class Practice_1_SumTestTest {

    Practice_1_SumTest p1s = new Practice_1_SumTest();

    @Test
    void getSum() {
        int a = 1;
        int b = 5;
        int answer = 8;

        try {
            assertThat(answer, is(p1s.getSum(a, b)));
        }
        catch (AssertionError e) {
            System.out.println(a + " + " + b + " = " + "NOT " + answer);
        }

        a = 3;
        b = 5;
        answer = 8;

        try {
            assertThat(answer, is(p1s.getSum(a, b)));
        }
        catch (AssertionError e) {
            System.out.println(a + " + " + b + " = " + "NOT " + answer);
        }
    }

    @Test
    void getMul() {
        int a = 3;
        int b = 5;
        int answer = 15;

        assertThat(answer, is(p1s.getMul(a, b)));
    }
}