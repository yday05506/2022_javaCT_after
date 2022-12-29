package day4;

import java.util.*;

class DontFinish {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i = 0;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i]))
                break;
        }

        return participant[i];
    }
}
