import java.util.*;
import java.io.*;

public class b11047{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] list = new int[n];
        int count = 0;

        for(int i=0; i<n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1; i>=0; i--) {
            if(k < list[i]) {
                continue;
            }
            while(true) {
                if(k < list[i]) {
                    break;
                }
                k -= list[i];
                count++;
            }
        }
       
        bw.write(count + "\n");
        br.close();
        bw.flush();
    }

    
}
