package day5;

class intTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;

        // 별도의 저장 공간을 따로 만들어서 사용(DP테이블)
        // → 계산할 공간을 저장할 배열 생성
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        // DP테이블의 초기값으로 왼쪽과 오른쪽을 더해서 설정
        // 계산은 현재값과 왼쪽(DP[i-1][j]), 오른쪽(DP(i-1)[j-1])
        for(int i = 1; i < triangle.length; i++) {
            // 맨 왼쪽
            dp[i][0] = dp[i-1][0] + triangle[i][0];

            // 중간
            for(int j = 1; j <= i; j++)
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];

            // 맨 오른쪽
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }

        for(int i = 0; i < triangle.length; i++)
            answer = Math.max(answer, dp[triangle.length-1][i]);

        return answer;
    }
}
