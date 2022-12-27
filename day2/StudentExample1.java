package day2;

import java.util.Arrays;
import java.util.List;

public class StudentExample1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("홍길동", 10),
                new Student("양다연", 18));

        double avg = studentList.stream()   // 오리지널 스트림
                .mapToInt(Student::getScore)    // 중간 처리
                .average()  // 최종 처리
                .getAsDouble();

        System.out.println("평균 : " + avg);
    }
}
