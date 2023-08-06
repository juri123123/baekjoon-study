import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b4134{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
       
        for(int i=0; i<n; i++) {
            String a = br.readLine();
            BigInteger big = new BigInteger(a);
            
            if(big.isProbablePrime(10)) {
                bw.write(a + "\n");
            } else {
                bw.write(String.valueOf(big.nextProbablePrime()) + "\n");
            }
        }
        
        br.close();
        bw.flush();

    }
}
