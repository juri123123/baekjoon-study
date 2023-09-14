import java.io.*;
import java.util.*;

public class b1978{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<num; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n==1) {

            } else {
                int k = 2;
                int flag = 1;
                while(k < n) {
                    if(n%k == 0) {
                        flag = 0;
                        break;
                    }
                    k++;
                }
                if(flag == 1) {
                    count++;
                }
            }
            
        }

        System.out.println(count);
        br.close();
        bw.flush();

    }
}
