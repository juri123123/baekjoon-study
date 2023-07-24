import java.io.*;
import java.util.*;

public class b19532{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x=0;
        int y=0;

        if(a == 0 && b != 0) {
            y = c/b;
            x = (f - e*y) / d;
        } else if(a != 0 && b == 0){
            x = c/a;
            y = (f - d*x) / e;
        } else {
            y = (c*d - a*f) / (b*d - e*a);
            x = (c - b*y) / a;
        }


        bw.write(x + " " + y + "\n");
        br.close();
        bw.flush();

    }
}
