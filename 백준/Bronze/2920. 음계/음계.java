import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list= new int[8];
        for(int i=0;i<8;i++)
        {
            list[i]= Integer.parseInt(st.nextToken());
        }
        
        System.out.println(result(list)); 

        br.close(); 
    }

    static String result(int[] list)
    {
        String result = "";
        for(int i=1;i<list.length;i++)
        {
            if(list[i] == list[i-1]+1 )
                result="ascending";
            else if(list[i] == list[i-1]-1 )
                result="descending";
            else
                return result ="mixed ";  
        }
        return result;
    }

}
