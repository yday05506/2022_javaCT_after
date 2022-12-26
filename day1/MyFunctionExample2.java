package day1;

import java.util.function.IntBinaryOperator;

public class MyFunctionExample2 {
    public static void main(String[] args) {
        IntBinaryOperator result1;

        // 정적 메서드 참조
        result1 = (x, y) -> MyFunctionClass.staticMethod(x, y);
        System.out.println("결과 1 : " + result1.applyAsInt(3, 4));

        result1 = MyFunctionClass::staticMethod;
        System.out.println("결과 2 : " + result1.applyAsInt(3, 4));

        // 일반 메서드 참조
        MyFunctionClass f1 = new MyFunctionClass();
        result1 = (x, y) -> f1.instanceMethod(x, y);
        System.out.println("결과 3 : " + result1.applyAsInt(3, 4));

        result1 = f1::instanceMethod;
        System.out.println("결과 4 : " + result1.applyAsInt(3, 4));
    }
}
