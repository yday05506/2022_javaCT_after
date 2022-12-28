package day3;

import java.util.Arrays;

class kNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    // 3

        for(int i = 0; i < commands.length; i++) {
            int[] slice = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);  // 원본 배열, 복사할 시작 인덱스, 끝 인덱스
            Arrays.sort(slice); // 배열 오름차순 정렬
            answer[i] = slice[commands[i][2]-1];
        }

        return answer;
    }
}