package day5;

import java.util.*;

class PhoneNumList2 {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> phoneNum = new HashMap();

        for(int i = 0; i < phone_book.length; i++) {
            phoneNum.put(phone_book[i], i);
        }

        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(phoneNum.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        return true;
    }
}
