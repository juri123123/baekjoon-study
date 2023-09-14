import java.io.*;
import java.util.*;

public class b24262{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int result = n*(n-1)/2;

        System.out.println(result);
        System.out.println(2);
        br.close();
        bw.flush();

    }
}
