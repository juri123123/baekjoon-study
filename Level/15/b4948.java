import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b4948{
    public static boolean[] primeNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            int count = 0;

            primeNum = new boolean[2*n + 1];
            getPrimeNum();
            for(int i=n+1; i<=2*n; i++) {
                if(!primeNum[i]) {
                    //System.out.print(i + " ");
                    count++;
                }

            }
            bw.write(count + "\n");
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
