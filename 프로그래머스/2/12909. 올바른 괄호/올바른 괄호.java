import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        //스택 - 후입 선출 
        Stack<String> sta = new Stack<>();
        
        for(int i=0;i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                sta.add(s);
            }
            
            else
            {
                if(sta.size() ==0)
                {
                    return false;
                }
                else
                {
                    sta.pop();
                }
            }
        }
        
        if(sta.size() !=0)
        {
            answer= false;
        }
        else
        {
            answer= true;
        }

        return answer;
    }
}