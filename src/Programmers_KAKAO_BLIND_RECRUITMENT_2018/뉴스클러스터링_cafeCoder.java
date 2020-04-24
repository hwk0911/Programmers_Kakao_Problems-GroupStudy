package Programmers_KAKAO_BLIND_RECRUITMENT_2018;

import java.util.ArrayList;
import java.util.HashSet;
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

        System.out.println(intersection);
        System.out.println(sum);

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

        for(String temp : word) {
            System.out.println(temp);
        }
        System.out.println();

        return word;
    }

    public Double sum (List<String> list1, List<String> list2) {
        return list1.size() + list2.size() + 0.0;
    }

    public Double intersection (List<String> list1, List<String> list2) {
        HashSet<String> hashSet = new HashSet<>();

        for(String str : list1) {
            if(list2.contains(str)) {
                hashSet.add(str);
            }
        }

        return hashSet.size() + 0.0;
    }

    /*
    중복 합집합 처리할것.
     */
}
