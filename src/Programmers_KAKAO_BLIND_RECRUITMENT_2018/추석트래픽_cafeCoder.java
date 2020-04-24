package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 추석트래픽_cafeCoder {
    public int solution(String[] lines) {
        int answer = 0;

        List<Integer[]> schedules = new ArrayList<>();

        for (String line : lines) {
            StringTokenizer st = new StringTokenizer(line);
            st.nextToken();

            Integer[] schedule = new Integer[2];
            schedule[1] = castingInteger(st.nextToken());
            schedule[0] = getStartTime(schedule[1], st.nextToken());

            schedules.add(schedule);
        }

        for(Integer[] schedule : schedules) {
            int timeCheck = 0;
            int start = schedule[0];
            int end = start + 998;

            for(Integer[] index : schedules) {
                int tempStart = index[0];
                int tempEnd = index[1];

                if(start <= tempStart && tempStart <= end) {
                    ++timeCheck;
                }
                else if(start <= tempEnd && tempEnd <= end) {
                    ++timeCheck;
                }
                else if(tempStart <= start && end < tempEnd) {
                    ++timeCheck;
                }
            }

            answer = Math.max(answer, timeCheck);
            timeCheck = 0;


            start = schedule[1];
            end = schedule[1] + 998;

            for(Integer[] index : schedules) {
                int tempStart = index[0];
                int tempEnd = index[1];

                if(start <= tempStart && tempStart <= end) {
                    ++timeCheck;
                }
                else if(start <= tempEnd && tempEnd <= end) {
                    ++timeCheck;
                }
                else if(tempStart <= start && end <= tempEnd) {
                    ++timeCheck;
                }
            }

            answer = Math.max(answer, timeCheck);
        }
        return answer;
    }

    public Integer castingInteger(String line) {
        Integer retTime = 0;

        StringTokenizer st = new StringTokenizer(line, ":");

        while (st.hasMoreTokens()) {
            if (st.countTokens() != 1) {
                retTime += Integer.parseInt(st.nextToken());
                retTime *= 60;
            } else {
                String[] temp = st.nextToken().split("\\.");
                retTime += Integer.parseInt(temp[0]);
                retTime *= 1000;
                retTime += Integer.parseInt(temp[1]);
            }
        }

        return retTime;
    }

    public Integer getStartTime(Integer end, String s) {
        String[] temp = s.substring(0, s.length() - 1).split("\\.");

        if(temp.length == 2) {
            end -= (Integer.parseInt(temp[0]) * 1000) + Integer.parseInt(temp[1]);
        }
        else {
            end -= (Integer.parseInt(temp[0]) * 1000);
        }

        return end;
    }
}