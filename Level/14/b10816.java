import java.io.*;
import java.util.*;

public class b10816{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        HashMap<Integer, Integer> map1 = new HashMap<>();
        
        for (int i=0; i<n; i++) {
            
            int a = Integer.parseInt(st.nextToken());
            if(map1.containsKey(a)) {
                map1.put(a, map1.get(a)+1);
            } else {
                map1.put(a,1);
            }
            
        }

        int m = Integer.parseInt(br.readLine());
        String input2 = br.readLine();
        st = new StringTokenizer(input2);

        for(int i=0; i<m; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(map1.containsKey(a)) {
                bw.write(map1.get(a) + " ");
            } else {
                bw.write(0 + " ");
            }
        }
        
        br.close();
        bw.flush();

    }
}
