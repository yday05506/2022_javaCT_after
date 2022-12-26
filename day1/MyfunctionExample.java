package day1;

public class MyfunctionExample {
    public static void main(String[] args) {
        MyFucnctionInterface fi;

        // 메서드 구현(데이터 처리부)
        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> System.out.println("method call2");
        fi.method();
    }
}
