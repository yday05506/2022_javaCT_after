package day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        // asDoubleStream
        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);

        intStream.asDoubleStream()  // double형으로 변환
                .forEach(d->System.out.println(d)); // 최종 출력

        System.out.println("===================================");

        // boxed
        intStream = Arrays.stream(intArray);
        intStream.boxed()   // 기본형 자료형 -> 랩퍼 오브젝트형으로
                .forEach(obj->System.out.println(obj.intValue()));

        System.out.println("===================================");

        // flapMap
        List<String> inputList = Arrays.asList("java lambda", "stream mapping");
        inputList.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(word->System.out.println(word));
    }
}
