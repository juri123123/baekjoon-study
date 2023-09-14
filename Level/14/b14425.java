import java.io.*;
import java.util.*;

public class b14425{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<String>();
        for (int i=0; i<n; i++) {
            set.add(br.readLine());
        }
        int count = 0;
        for (int i=0; i<m; i++) {
            String s = br.readLine();
            if(set.contains(s)) {
                count++;
            }
        }
        bw.write(count + "\n");
        br.close();
        bw.flush();

    }
}
