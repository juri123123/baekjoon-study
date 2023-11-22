import java.io.*;
import java.util.*;

public class s1926{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j=1; j<=n; j++) {
                String s = Integer.toString(j);
                if(s.contains("3")){
                    count++;
                } else if (s.contains("6")){
                    count++;
                } else  if(s.contains("9")) {

                }

        }

        br.close();
        bw.flush();

    }
    }
}
