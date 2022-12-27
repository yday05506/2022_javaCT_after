package day2;

import java.util.Arrays;
import java.util.List;

public class FilterSample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "양다연", "홍길동");

        names.stream()  // 오리지널 스트림으로 전환
                .distinct() // 중간 처리(중복 제거)
                .forEach(n->System.out.println(n)); // 최종 처리

        System.out.println("-------------------------------------");

        names.stream()
                .filter(n->n.startsWith("신"))   // 중간 처리(무슨 글자로 시작하는지)
                .forEach(n->System.out.println(n)); // 최종 처리

        // 중복 제거 + 필터
    }
}
