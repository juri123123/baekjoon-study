import java.io.*;
import java.util.*;

public class b24313{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if(a1 * n0 + a2 <= c * n0){
            bw.write(1+"\n");
        } else {
            bw.write(0+"\n");
        }
        br.close();
        bw.flush();

    }
}
