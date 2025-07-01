import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {
    

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N= Integer.parseInt(br.readLine());

        int sum=0; // 소수 개수 
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++)
        {
            int num = Integer.parseInt(st.nextToken());  
            if(isPrime(num))
                sum++;
        }
        
        System.out.println(sum);

        br.close();

        bw.flush(); bw.close();
        
    }

    static boolean isPrime(int num)
    {
        if(num==1)
            return false;
        
        //제곱근 이하로 범위가 줄어들게 되는 이유: 소수인지 판별 할 
        //  자연수의 제곱근을 기준으로 그 숫자의 약수들의 곱셈은 대칭적으로 곱셈이 일어나기 때문
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }

        return true; //num==2일 경우 
    }
   
}
