package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import java.util.StringTokenizer;

public class 추석트래픽_cafeCoder {
    public int solution(String[] lines) {
        int answer = 1;

        for (int index = 0, size = lines.length; index < size; ++index) {
            lines[index] = lines[index].substring(11);
        }

        for(int index = 0, size = lines.length ; index < size; ++index) {
            String[] schedules = lines[index].split(" ");
            double standard = getEndTime(schedules[0]);
            standard = getStartTime(standard, schedules[1]);
            int tempAnswer = 1;

            for(int index_2 = 0 ; index_2 < size ; ++index_2) {
                if(index == index_2) {
                    continue;
                }
                else {
                    schedules = lines[index_2].split(" ");
                    double scheduleEnd = getEndTime(schedules[0]);
                    double scheduleStart = getStartTime(scheduleEnd, schedules[1]);

                    if (containSec(standard, scheduleStart, scheduleEnd)) {
                        ++tempAnswer;
                    }
                }
            }
            answer = Math.max(answer, tempAnswer);
            System.out.println();
        }

        return answer;
    }

    public boolean containSec(double standard, double scheduleStart, double scheduleEnd) {
        if(standard <= scheduleStart || standard + 1 >= scheduleStart) {
            return true;
        }
        else if(standard <= scheduleEnd || standard + 1 >= scheduleEnd) {
            return true;
        }
        return false;
    }

    public double getEndTime(String endSchedule) {
        double endTime = 0;

        StringTokenizer st = new StringTokenizer(endSchedule, ":");

        while (st.hasMoreTokens()) {
            if (st.countTokens() != 0) {
                endTime *= 60;
            }
            endTime += Double.parseDouble(st.nextToken());
        }

        return endTime;
    }

    public double getStartTime(double endTime, String need) {
        double startTime = endTime - Double.parseDouble(need.substring(0, need.length() - 1));

        return startTime + 0.001;
    }
}

/*
시작 또는 마지막 전이 포함되어있으면 true 반환하는걸로.
 */