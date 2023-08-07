import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b17103{
    public static boolean[] primeNum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());

            primeNum = new boolean[a];
            getPrimeNum();

            int count = 0;
            for(int j=2; j<=a/2; j++){
                if(!primeNum[j]) {
                    int b = a - j;
                    if(!primeNum[b]) {
                        count++;
                    }
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
