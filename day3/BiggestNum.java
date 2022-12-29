package day3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        // comparable과 comparator의 차이
        // comparable : 자기 자신과 매개변수 객체의 비교
        // comparator : 두 매개변수 객체의 비교
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
                // 오름차순 정렬 : (o1+o2).compareTo(o1+o2);
            }
        });

        // 람다식
        Arrays.sort(str, (a, b) ->(b+a).compareTo(a+b));

        // stream으로 변형
        answer = IntStream.of(numbers).mapToObj(String::valueOf).sorted((a,b) -> (b+a).compareTo(a+b)).collect(Collectors.joining());

        // 0이 들어왔을 때 값을 문자열 0으로
        if(str[0].equals("0")) return "0";

        // 0이 아니면 문자열 더함
        for(String s : str) answer += s;    // stream으로 변경하는 식에 joining이 있기 때문에 필요 없음

        return answer;
    }
}