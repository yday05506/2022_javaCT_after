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
            long mid = (left + right) / 2;  // 중간값
            long sum = 0;   // 심사하는 인원

            for(int i = 0; i < times.length; i++)
                sum += mid / times[i];  // mid값에 심사하는 시간을 나눠서 sum에 저장
                // ex) times = 7, 10 | n = 6
                //     left = 1 | right = 10 * 6 → 60 | mid = 61 / 2 → 30.5
                //     sum = 30.5 / 7 → 4, 30.5 / 10 → 3 => 7
                //     → mid로 정해놓은 시간 내에 n이 모두 심사를 받을 수 있는가를 체크

            if(sum < n) // 심사를 해야 할 인원이 더 크면
                left = mid + 1; // 시작하는 위치를 바꿔서 다시
            else {
                right = mid - 1;    // 아니라면 끝값을 정리해서 다시
                answer = mid;
            }
        }

        return answer;
    }
}
