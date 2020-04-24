package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class 뉴스클러스터링_cafeCoderTest {

    뉴스클러스터링_cafeCoder main = new 뉴스클러스터링_cafeCoder();

    @Test
    void solution() {
        String str1 = "FRANCE";
        String str2 = "french";
        int answer = 16384;

        //assertThat(answer, is(main.solution(str1, str2)));

        str1 = "handshake";
        str2 = "shake hands";
        answer = 65536;

        //assertThat(answer, is(main.solution(str1, str2)));

        str1 = "aa1+aa2";
        str2 = "AAAA12";
        answer = 43690;

        //assertThat(answer, is(main.solution(str1, str2)));


        str1 = "E=M*C^2";
        str2 = "e=m*c^2";
        answer = 65536;

        //assertThat(answer, is(main.solution(str1, str2)));

        str1 = "";
        str2 = "";
        answer = 65536;

        //assertThat(answer, is(main.solution(str1, str2)));


        str1 = "45682123";
        str2 = "456456648978946";
        answer = 65536;

        //assertThat(answer, is(main.solution(str1, str2)));

        str1 = "AAAABBBBCC";
        str2 = "AABBBBDDEE";
        answer = 28086;

        assertThat(answer, is(main.solution(str1, str2)));



    }
    /*
    FRANCE	french	16384
    handshake	shake hands	65536
    aa1+aa2	AAAA12	43690
    E=M*C^2	e=m*c^2	65536
     */
}