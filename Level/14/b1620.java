import java.io.*;
import java.util.*;

public class b1620{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];
        //ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<n; i++) {
            String a = br.readLine();
            map.put(a,i+1);
            arr[i] = a;
        }
        for(int i=0; i<m; i++) {
            String a = br.readLine();
            try {
                int k = Integer.parseInt(a);
                bw.write(arr[k-1] + "\n");
            } catch(NumberFormatException ne) {
                bw.write(map.get(a) + "\n");
            }
        }
        
        br.close();
        bw.flush();

    }
}
