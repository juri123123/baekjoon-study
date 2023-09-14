import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b13909{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=1; i*i<=n;i++) {
            count++;
        }

        bw.write(count + "\n");
        br.close();
        bw.flush();

    }
}
