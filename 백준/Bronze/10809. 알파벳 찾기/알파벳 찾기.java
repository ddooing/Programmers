import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S ;
        
        while(true)
        {
            S=br.readLine();
            //단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 
            if(S.length() <= 100 && S.matches("[a-z]+"))
                break;
        }
        //a,b,c,d,e,f,g,h,i,j,k,m,n,l,o,p,q,r,,vs,t,u,w,x,y,z
        int[] alpa= new int[26];
        Arrays.fill(alpa, -1); // !! 초기값 채우기
        
        for(int i=0;i<alpa.length;i++) // 고정 길이 알파벳 길이
        {
            for(int j=0;j<S.length();j++)
            {
                if(alpa[i]!=-1)////처음 등장하는 위치로 잡기에 , 최소 인덱스 0을 넘으면 넘어가기
                    break;
                if(i==S.charAt(j)-'a') //!! S.charAt(i)-'a' -- a~z => 0~ 25 바꾸기 
                    alpa[i]=j;
            }
        }

        for(int a : alpa)
        {
            System.out.print(a +" ");
        }

        br.close(); 
    }

}
