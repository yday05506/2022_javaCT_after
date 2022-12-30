package day5;

class CorrectBracket {
    int cnt = 0;

    public int solution(int n) {
        int answer = 0;
        // 깊이 탐색
        // stack 이용하거나 dfs 메소드 이용
        cnt = 0;

        dfs(0, 0, n);
        return cnt;
    }

    public void dfs(int left, int right, int n) {
        if(left < right) return;
        if(left == n && right == n) {
            cnt++;
            return;
        }

        if(left > n || right > n) return;

        dfs(left+1, right, n);
        dfs(left, right+1, n);
    }
}
