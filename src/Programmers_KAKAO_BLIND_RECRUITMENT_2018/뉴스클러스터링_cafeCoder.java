package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import java.util.ArrayList;
import java.util.List;

public class 뉴스클러스터링_cafeCoder {
    public int solution(String str1, String str2) {
        int answer = 0;

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        List<String> strList1 = setList(str1);
        List<String> strList2 = setList(str2);

        answer = j(sum(strList1, strList2), intersection(strList1, strList2));

        return answer;
    }

    public int j (Double sum, Double intersection) {
        Double j = intersection / sum * 65536;

        if(sum == 0 && intersection == 0) {
            return 65536;
        }

        return j.intValue();
    }

    public List<String> setList (String str) {
        char[] strArr = str.toCharArray();
        List<String> word = new ArrayList<>();

        for(int index = 0, size = strArr.length - 1 ; index < size ; ++index) {
            char c1 = strArr[index];
            char c2 = strArr[index + 1];

            if(c1 < 'A' || c1 > 'Z') {
                continue;
            }
            else if(c2 < 'A' || c2 > 'Z') {
                continue;
            }
            else {
                word.add(new String()+c1+c2);
            }
        }

        System.out.println(word);

        return word;
    }

    public Double sum (List<String> list1, List<String> list2) {
        Double overlap = intersection(list1, list2);

        System.out.println(list1.size() + list2.size() - overlap);

        return list1.size() + list2.size() - overlap;
    }

    public Double intersection (List<String> list1, List<String> list2) {
        Double ret1 = 0.0;
        Double ret2 = 0.0;

        for(String str : list1) {
            if(list2.contains(str)) {
                ++ret1;
            }
        }

        for(String str : list2) {
            if(list1.contains(str)) {
                ++ret2;
            }
        }

        System.out.println(Math.min(ret1, ret2));

        return Math.min(ret1,ret2);
    }
}
