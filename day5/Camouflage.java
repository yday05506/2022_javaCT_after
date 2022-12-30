package day5;

import java.util.*;

class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap();

        // 배열을 Map 테이블로 만들기
        for(String[] c : clothes) {
            String type = c[1]; // 종류를 type에 설정
            // getOrDefault(키 이름, 해당 값)
            // key라는 키 값에 value가 없으면 0으로 세팅
            // 이전 값이 있으면 +1을 더함
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 조합
        Iterator<Integer> it = map.values().iterator();
        // map에 저장된 값들을 참조할 반복자 선언
        while(it.hasNext()) {
            // 모든 종류의 옷을 서로 곱해서 경우의 수를 구함
            // ex. 3 * 2 → 6 - 1
            answer *= it.next().intValue() + 1;
        }

        // none(어떤 종류)의 옷도 입지 않은 경우
        return answer -1;
    }
}
