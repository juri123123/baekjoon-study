import java.io.*;
import java.util.*;

public class b1934{

    public static int GCD(int a, int b) {
        if(b==0) {
            return a;
        }
        return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int k = (a*b / GCD(a,b));

            bw.write(k + "\n");

        }
       
        br.close();
        bw.flush();

    }
}
