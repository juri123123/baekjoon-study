import java.io.*;
import java.util.*;

public class b7785{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<String,String> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            String name = st.nextToken();
            String isEnter = st.nextToken();
            if(!map.containsKey(name)) {
                map.put(name, isEnter);
            } else {
                map.remove(name);
            }
        }

        String[] arr = map.keySet().toArray(new String[map.size()]);

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--) {
            bw.write(arr[i] + "\n");
        }



        br.close();
        bw.flush();

    }
}
