import java.io.*;
import java.util.*;

public class b1427{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] arr = new int[input.length()];

        for(int i=0; i<input.length(); i++) {
            arr[i] = input.charAt(i)-'0';
        }

        Arrays.sort(arr);
        for(int i=input.length()-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
        br.close();
        bw.flush();

    }
}
