import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answer_list = new ArrayList<>();
        
        for(int i=0;i<commands.length;i++)
        {
            //배열 부분 추출 Arrays.copyOfRange(배열, 시작부분,마지막 부분)
            //ex 1~3 -> copyOfRange(0,4)
            int front =commands[i][0] -1;
            int last =commands[i][1] ;
            
            int[] list = Arrays.copyOfRange(array,front ,last);
            
            Arrays.sort(list);
            
            int k= commands[i][2] -1;
            answer_list.add(list[k]);
        }
        
        answer= new int[answer_list.size()];
        
        for(int i=0;i<answer.length;i++)
        {
            answer[i]= answer_list.get(i);
        }
        return answer;
    }
}