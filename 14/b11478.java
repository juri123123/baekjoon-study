import java.io.*;
import java.util.*;

public class b11478{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        //HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String s = "";
        for(int i=0; i<input.length(); i++) {
            for(int j=i; j<=input.length(); j++) {
                s = input.substring(i, j);
                set.add(s);
            }
        }
        System.out.println(set.size()-1);
       
        br.close();
        bw.flush();

    }
}
