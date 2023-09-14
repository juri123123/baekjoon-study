import java.io.*;
import java.util.*;

public class b1764{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(br.readLine(), 0);
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<m; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) {
                list.add(name);
            }
        }
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);

        bw.write(arr.length + "\n");
        for(int i=0; i<arr.length; i++) {
            bw.write(arr[i] + "\n");
        }
        br.close();
        bw.flush();

    }
}
