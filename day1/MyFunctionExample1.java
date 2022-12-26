package day1;

public class MyFunctionExample1 {
    public static void main(String[] args) {
        MyFunctionInterface1 fi1;

        // 구현
        fi1 = (a, b) -> {
            System.out.println(a+b);
        };

        // 호출
        fi1.method1(3, 5);
    }
}
