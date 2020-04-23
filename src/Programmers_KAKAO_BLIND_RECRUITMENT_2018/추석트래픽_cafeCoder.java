package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 추석트래픽_cafeCoder {
    public int solution(String[] lines) {
        int answer = 1;
        List<Double[]> startToEnd = new ArrayList<>();

        for (int index = 0, size = lines.length; index < size; ++index) {
            lines[index] = lines[index].substring(11);

            String[] line = lines[index].split(" ");

            Double[] tempTime = new Double[2];
            tempTime[1] = getEndTime(line[0]);
            tempTime[0] = getStartTime(tempTime[1], line[1]);

            startToEnd.add(tempTime);
        }

        for(Double[] doubles : startToEnd) {
            answer = Math.max(answer, containSec(doubles, startToEnd));
        }


        return answer;
    }

    public int containSec(Double[] standard, List<Double[]> startToEnd) {
        int answer = 0;

        for(double time = standard[0], end = standard[1] ; time <= end ; time += 0.001) {
            System.out.println(time);
            int tempAnswer = 0;
            for(Double[] doubles : startToEnd) {
                if(doubles[0] <= time && time <= doubles[1]) {
                    ++tempAnswer;
                }
            }

            answer = Math.max(answer, tempAnswer);
        }

        return answer;
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

        return startTime;
    }
}

/*
브루트 포스 방식으로 변경
 */