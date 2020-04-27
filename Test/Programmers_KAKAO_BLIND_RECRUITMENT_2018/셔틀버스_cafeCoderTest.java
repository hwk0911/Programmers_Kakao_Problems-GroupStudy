package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 셔틀버스_cafeCoderTest {

    셔틀버스_cafeCoder main = new 셔틀버스_cafeCoder();

    @Test
    void solution() {
        int n = 1;
        int m = 1;
        int t = 5;
        String[] timeTable = {"08:00", "08:01", "08:02", "08:03"};

        main.solution(n,m,t,timeTable);
    }
}