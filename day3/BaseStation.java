package day3;

public class BaseStation {
    public int solution(int n, int[] stations, int w) {
        // n :아파트 동 개수
        // stations : 기지국이 설치된 위치
        // w : 전파 범위
        int answer = 0;

        // 배열로 접근
        // 배열에 접근할 수 있는 인덱스 번호
        int index = 0;

        // 현재 기지국이 설치된 값을 체크할 변수
        int position = 1;

        // 현재 위치에서 아파트 동을 반복하면서
        while(position <= n) {  // 위치가 전체 개수보다 작거나 같을 때까지
            // 1) 기존에 기지국이 설치되어 있는 경우 -> 전파 범위 체크
            // 설치된 기지국 범위 내에 있으면서 현재 위치가 설치된 기지국의 범위보다 클 때
            if(index < stations.length && position >= stations[index]-w) {
                position = stations[index]+w+1; // 설치된 기지국의 범위보다 +1 큰 위치로 이동
                index++;    // 다음 인덱스로 이동
            }
            // 2) 새롭게 설치하는 경우
            else {  // 설치된 기지국 범위 밖일 때
                position += 2*w+1;  // 양쪽으로 범위를 가질 최댓값 +1
                answer++;   // 기지국을 설치했으므로 결과값 추가
            }

        }

        return answer;
    }
}
