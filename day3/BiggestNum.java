package day3;

import java.util.*;

class BiggestNum {
    public String solution(int[] numbers) {
        String answer = "";

        // numbers : 숫자 -> 문자로 변환(내림차순)
        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            // 문자열 다루는 배열의 주어진 numbers를 문자로 저장
            str[i] = String.valueOf(numbers[i]);
        }

        // 정렬
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
                // 오름차순 정렬 : (o1+o2).compareTo(o1+o2);
            }
        });

        // 0이 들어왔을 때 값을 문자열 0으로
        if(str[0].equals("0")) return "0";

        // 0이 아니면 문자열 더함
        for(String s : str) answer += s;

        return answer;
    }
}