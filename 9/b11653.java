import java.io.*;
import java.util.*;

public class b11653{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if(n != 1){
            int i=2;
            while(i <= n) {
                while(n % i == 0){
                    n /= i;
                    bw.write(i+"\n");
                }
                i++;
            }
        }
        br.close();
        bw.flush();

    }
}
