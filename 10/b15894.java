import java.io.*;
import java.util.*;

public class b15894{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());

        bw.write(n*4+"\n");


        br.close();
        bw.flush();

    }
}
