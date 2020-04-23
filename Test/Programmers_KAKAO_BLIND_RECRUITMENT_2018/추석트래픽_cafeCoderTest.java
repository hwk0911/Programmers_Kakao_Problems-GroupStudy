package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class 추석트래픽_cafeCoderTest {

    추석트래픽_cafeCoder main = new 추석트래픽_cafeCoder();

    @Test
    void getEndTime() {
        String time = "01:10:02.002";

        StringTokenizer st = new StringTokenizer(time, ":");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            System.out.println(st.countTokens());
        }

        assertThat(4202.002,is(main.getEndTime(time)));
    }

    @Test
    void getStartTime() {
        double startTime = 4202.022;
        String need = "2.0s";

        assertThat(4200.022, is(main.getStartTime(startTime, need)));
    }

    @Test
    void solution() {
        /*
        String[] lines = {
                "2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"};

        assertThat(7, is(main.solution(lines)));


         */
        System.out.println();
        System.out.println();

        String[] lines_2 = {
                "2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"
        };

        assertThat(1, is(main.solution(lines_2)));
    }
}