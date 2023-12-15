import java.util.*;
import java.io.*;
public class b23971 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int height = h / (n+1) + (h % (n+1) == 0 ? 0 : 1);
        int weight = w / (m+1) + (w % (m+1) == 0 ? 0 : 1);
        int result = 0;

        if(h == 1) {
            result = weight;
        } else if(w == 1) {
            result = height;
        } 
        else {
            result = height*weight;
        }

       

        bw.write(result + "\n");

        br.close();
        bw.flush();
    }

}
