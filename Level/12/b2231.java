import java.io.*;
import java.util.*;

public class b2231{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int n = Integer.parseInt(br.readLine());
       int flag = 0;
       

       for(int i=0; i<n; i++) {
        int k = i;
        int sum = 0;

        while(k != 0) {
            sum += k%10;
            k /= 10;
        }
        if(sum+i == n) {
            bw.write(i+"\n");
            flag = 1;
            break;
        }
       }
       if(flag==0) {
        bw.write(0+"\n");
       }
        
        
        br.close();
        bw.flush();

    }
}
