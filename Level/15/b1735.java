import java.io.*;
import java.util.*;

public class b1735{

    public static int GCD(int a, int b) {
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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input);

        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int a3 = a*b2 + a2*b;
        int b3 = b*b2;

        bw.write(a3 / GCD(a3,b3) + " " + b3 / GCD(a3, b3));
       
        br.close();
        bw.flush();

    }
}
