import java.io.*;
import java.util.*;

public class s1928{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Test = Integer.parseInt(br.readLine());
        for(int t=1; t<=Test; t++) {
            String input = br.readLine();
            String result = new String(Base64.getDecoder().decode(input));
            bw.write("#" + t + " " + result + "\n");
        }


        br.close();
        bw.flush();

    }
}
