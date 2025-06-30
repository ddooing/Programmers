import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {
    
        Scanner sc = new Scanner(System.in);

        int T =sc.nextInt();
        int[] result  = new int[T];
        for(int i=0;i<T;i++)
        {
            int k = sc.nextInt();
            int n = sc.nextInt();
            result[i] = person(k,n);
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(result[i]);
        }
        
    }

    static int person(int k, int n)
    {
        int[][] arr = new int[k+1][n];

        
        //0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다
        for(int i=0;i<n;i++)
        {
            arr[0][i]=i+1;
        }
         //모든 층의 1호에 사람 수는 1명
        for(int i=0;i<k+1;i++)
        {
            arr[i][0]=1; //!! [0]은 1호
        }

        for(int i=1;i<k+1;i++)
        {
            for(int j=1;j<n;j++) //!! 1호부터 시작하기에 범위 조심하기 
            {
                arr[i][j]=arr[i][j-1]+arr[i-1][j];

            }
        }

        return arr[k][n-1];
    }


}
