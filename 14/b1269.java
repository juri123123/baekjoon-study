import java.io.*;
import java.util.*;

public class b1269{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            map.put(Integer.parseInt(st.nextToken()), 0);
        }
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<m; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(map.containsKey(a)) {
                map.remove(a);
            } else {
                map.put(a, 0);
            }   
        }

        bw.write(map.size() + "\n");
       
        br.close();
        bw.flush();

    }
}
