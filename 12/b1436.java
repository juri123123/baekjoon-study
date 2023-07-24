import java.io.*;
import java.util.*;

public class b1436{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 1;

        while(true){
            num++;
            String s = Integer.toString(num);
            if(s.contains("666")) {
                count++;
            }
            if(count == n) {
                break;
            }
        }

        bw.write(num+"\n");

        br.close();
        bw.flush();

    }
}
