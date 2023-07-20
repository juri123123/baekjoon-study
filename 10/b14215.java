import java.io.*;
import java.util.*;

public class b14215{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        //System.out.println(arr[0] + " " + arr[1] + " " +arr[2]);

        if(arr[0]==arr[1] && arr[1]==arr[2]){
            bw.write(arr[0] + arr[1] + arr[2]+"\n");
        } else if(arr[0]==arr[1]){
            if(arr[2]>=arr[0]+arr[1]) {
                arr[2] = arr[0]+arr[1]-1;
                bw.write(arr[0] + arr[1] + arr[2]+"\n");
            
            } else {
                bw.write(arr[0] + arr[1] + arr[2]+"\n");
            }
            
        } else if (arr[0]+arr[1] <= arr[2]) {
            arr[2] = arr[0]+arr[1]-1;
            bw.write(arr[0] + arr[1] + arr[2]+"\n");
        } else {
            bw.write(arr[0] + arr[1] + arr[2]+"\n");
        }

        
        
        br.close();
        bw.flush();

    }
}
