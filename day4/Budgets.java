package day4;

import java.util.Arrays;

class Budgets {
    public int solution(int[] budgets, int M) {
        int answer = 0;

        // 최소값
        int min = 0;
        // 최대값
//        int max = IntStream.of(budgets).max().orElse(0);  // stream
        int max = 0;

        for(int b : budgets) {
            if(b > max) max = b;
        }

        // 최대값, 최소값 비교(이진탐색)
        while(min <= max) {
            // stream으로 구하는 법
//            int mid = (min + max) / 2;  // 중앙값
//            int sum = IntStream.of(budgets).map(b->Math.min(b, mid)).sum();

            int mid = (min + max) / 2;
            int sum = 0;

            for(int b : budgets) {
                if(b > mid) // 신청한 예산이 상한액보다 큰 경우
                    sum += mid;
                else sum += b;  // 신청한 값으로
            }

            // 총 합계 금액과 총 예산 비교
            if(sum <= M) {
                min = mid + 1;  // 최소값 새 조정
                answer = mid;
            }
            else max = mid - 1;
        }

        return answer;
    }
}