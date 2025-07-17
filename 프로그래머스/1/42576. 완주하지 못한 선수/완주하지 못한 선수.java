import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //참가자 중에는 동명이인이 있을 수 있습니다.
        // 참가 이름 ,참가한 이름의 수 
        HashMap<String, Integer> map = new HashMap<>();
        
        for( String s : participant)
        {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for( String s : completion)
        {
            map.compute(s, (k, v) -> (v - 1 <= 0) ? null : v - 1);
        }
        // v - 1의 결과가 0이거나 음수면 → null 반환 → map에서 삭제됨

        //아니면 → 수정된 값으로 업데이트됨
        
        for(String key : map.keySet())
        {
            return key;
        }
        return "";
    }
}

/*
compute(key, remappingFunction)
무조건 실행: key의 존재 여부와 상관없이

computeIfPresent(key, remappingFunction)
key가 있을 때만 실행
→ 존재하는 키에 대해서만 값을 수정하고, 없으면 아무 것도 하지 않음.
* key 를 삭제하지 못함

entrySet() 은 key 와 value 값
keySet()은 key 값만


*/