package day4;

import java.util.*;

class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;
        // 시간 정렬
        Arrays.sort(times);
        long left = 1;  // 최소 걸리는 시간 : 1분부터 시작
        // 최대로 걸리는 시간 -> 심사관 시간 * n명
        long right = (long) times[times.length-1] * n;

        // 최소와 최대 비교
        while(left <= right) {
            // 중간값
            long mid = (left + right) / 2;
            long sum = 0;

            for(int i = 0; i < times.length; i++)
                sum += mid / times[i];

            if(sum < n)
                left = mid + 1;
            else {
                right = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }
}
