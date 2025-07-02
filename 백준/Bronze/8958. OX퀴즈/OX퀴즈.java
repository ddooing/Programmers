import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T =Integer.parseInt(br.readLine());//테스트 개수
        int[] result= new int[T];
        for(int i=0;i<T;i++)
        {
            String str= br.readLine();
            result[i]= countT(str);
        }
        
        for(int i=0;i<T;i++)
        {
            System.out.println(result[i]);
        }

        br.close();
        
    }

    static int countT(String str)
    {
        int sum=0;
        int cnt_o =0;// o 점수 
        for(int i=0;i<str.length();i++)
        {
            char c= str.charAt(i);
            if(c=='O')
            {
                cnt_o++;
                sum+=cnt_o;
            }
            else if(c=='X')
                cnt_o =0;
        }

        return sum;

    }

}
