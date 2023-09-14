import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b1929{
    public static boolean[] primeNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        primeNum = new boolean[m+1];
        getPrimeNum();
        
        for(int i=n; i<=m; i++) {
            if(!primeNum[i]) {
                bw.write(i + "\n");
            }
        }
        br.close();
        bw.flush();

    }
    //에라토스테네스의 채
    public static void getPrimeNum() {
        primeNum[0] = true;
        primeNum[1] = true;

        for(int i=2; i<primeNum.length; i++) {
            for(int j=2; i*j<primeNum.length; j++) {
                primeNum[i*j] = true;
            }
        }
    }
}
