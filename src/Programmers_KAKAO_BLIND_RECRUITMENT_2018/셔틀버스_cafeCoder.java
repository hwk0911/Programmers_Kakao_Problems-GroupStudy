package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 셔틀버스_cafeCoder {
    public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";

        List<Date> crew = new ArrayList<>();

        for(String time : timetable) {
            try {
                crew.add(new SimpleDateFormat("HH:mm").parse(time + "00:10"));
                System.out.println(crew.get(crew.size() - 1));
            }
            catch(ParseException e) {
                e.getStackTrace();
            }
        }



        return answer;
    }
}
