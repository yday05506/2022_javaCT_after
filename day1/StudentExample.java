package day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentExample {
    public static int sum = 0;
    public static void main(String[] args) {
        // 컬렉션으로 스트림 얻기
        List<Student> studentList = Arrays.asList(new Student("홍길동", 10),
                new Student("신용권", 20));  // new 말고 add로 추가 가능

        // 반복자(Iterator)

        // 스트림(Stream)
        Stream<Student> stream = studentList.stream();
        stream.forEach((s)->System.out.println(s.getName()));
        System.out.println("--------------------------------------");

        // 배열로 스트림
        String[] strArray = {"홍길동", "김미림", "김배화"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a->System.out.println(a + ", "));
        System.out.println("--------------------------------------");

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a->System.out.println(a*2 + ", "));
        System.out.println();
        System.out.println("--------------------------------------");

        // 숫자로 스트림
        IntStream stream1 = IntStream.rangeClosed(1, 100);
        stream1.forEach(a->sum+=a);
        System.out.println("총합 : " + sum);
    }
}
