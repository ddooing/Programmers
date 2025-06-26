import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException  {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line= br.readLine();

        int N= Integer.parseInt(line);
        
        int nLen = (int)Math.log10(N)+1; //N의 자리수 

        int K=0;

        // N- sum_of_digits(K)  <= K 
             // K = i , sum_of_digits(K)= sum
        for(int i=(N-(nLen*9)); i<N; i++)
        {
            int sum=0;
            int num = i;
    
            while (num!=0 ) {
                sum+= num%10;
                num= num/10;
            }

            //N = K + sum_of_digits(K)
            if(i +sum == N )
            {
                K= i;
                break;
            }
        }
        
    
        System.out.println(K);

        br.close();
    }

}
