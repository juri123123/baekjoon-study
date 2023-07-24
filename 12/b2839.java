import java.io.*;
import java.util.*;

public class b2839{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = n;
        int flag = 1;   
        int a = k / 5;
        for(int i=a; i>=0; i--) {

            if((n-5*i) % 3 == 0) {
                bw.write(i + (n-5*i)/3 + "\n");
                flag = 0;
                break;
            }
        }
        if(flag == 1) bw.write(-1 + "\n");

        br.close();
        bw.flush();

    }
}
