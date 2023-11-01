import java.io.*;
import java.util.*;

public class b1543{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String word = br.readLine();
        int count = 0;

        while(true) {
            if(input.contains(word)) {
                input = input.replace(word, "!");
            }else {
                break;
            }
        }
        
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == '!') {
                count++;
            }
        }

        bw.write(count + "\n");
        br.close();
        bw.flush();

    }
}
