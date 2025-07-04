import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수
        int prod=1;
        for(int i=0;i<3;i++)
        {
            prod *= Integer.parseInt(br.readLine());

        }
        
        result(prod); 

        br.close(); 
    }

    static void result(int prod)
    {
        //0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를
        int[] num_cnt = new int[10];

        String prod_str = Integer.toString(prod);

        for(int i=0;i<prod_str.length();i++)
        {
            num_cnt[prod_str.charAt(i)-'0']++;
            //!! num_cnt[prod_str.charAt(i)] 작성 시,
                // ex) prod_str.charAt(i) = 1 이면 num_cnt['1'] 따옴표가 붙
                // char 은 정수 아스키코드로 취급하기에
                // 따라서 '0' 을 빼줘야함              
        }
        for(int i=0;i<num_cnt.length;i++)
        {
            System.out.println(num_cnt[i]);
        }
    }

}
