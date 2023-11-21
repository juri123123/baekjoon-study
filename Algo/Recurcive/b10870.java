import java.io.*;
import java.util.*;

public class b10870{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(fibo(n) + "\n");

        br.close();
        bw.flush();

    }

    static int fibo(int x) {
        
        if (x==0) {
            return 0;
        } 
        if (x==1) {
            return 1;
        }

        return fibo(x-1) + fibo(x-2);
    }
}
