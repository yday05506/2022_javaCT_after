package day4;

import java.util.*;

class NumberGame {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        // A : 1번째 팀, B : 2번째 팀
        // B팀의 승점 개수
        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length-1;

        for(int i = A.length-1; i >= 0; i--) {
            if(A[i] < B[index]) {
                index--;
                answer++;
            }
        }

        return answer;
    }
}
