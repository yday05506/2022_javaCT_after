package day2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopExample {
    public static void main(String[] args) {
        int[] intArray = {23,22,11,8,4};

        IntStream intStream = Arrays.stream(intArray);
        IntStream intStream1 = Arrays.stream(intArray);

        intStream.filter(a->a%2==0).peek(n->System.out.println(n)).sum();

        System.out.println("===============================");

        intStream1.filter(a->a%2==1).forEach(n->System.out.println(n));

        System.out.println("===============================");

        // 매칭
        int[] intArray1 = {2,4,6};

        boolean result = Arrays.stream(intArray1).allMatch(a->a%2==0);  // 다 맞을 때
        System.out.println("결과 : " + result);

        result = Arrays.stream(intArray1).anyMatch(a->a%3==0);  // 하나라도 맞으면
        System.out.println("결과 : " + result);

        result = Arrays.stream(intArray1).noneMatch(a->a%4==0); // 맞지 않을 때
        System.out.println("결과 : " + result);
    }
}
