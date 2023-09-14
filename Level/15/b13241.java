import java.io.*;
import java.util.*;

public class b13241{

    public static long GCD(long a, long b) {
        if(b==0) {
            return a;
        }
        return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        bw.write(a*b/GCD(a,b) + "\n");
       
        br.close();
        bw.flush();

    }
}
