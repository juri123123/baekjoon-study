import java.io.*;
import java.util.*;

public class b18870{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] tempArr = arr.clone();
        Arrays.sort(arr);
        int count = 0;
        //map
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<n; i++) {
            if(!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], count++);
            }
        }

        for(int i=0; i<n; i++) {
            bw.write(hashMap.get(tempArr[i]) + " ");
        }
        br.close();
        bw.flush();

    }
}
