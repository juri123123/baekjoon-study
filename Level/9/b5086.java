import java.io.*;
import java.util.*;

public class b5086{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a;
        int b;
        while(true) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a == 0 || b == 0) {
                break;
            }

            if (a <= b) {
                if(b % a == 0){
                    System.out.println("factor");
                } else {
                   System.out.println("neither"); 
                }
            } else {
                if (a % b == 0) {  
                    System.out.println("multiple");
                } else {
                   System.out.println("neither"); 
                }
                
            }
        }
                   
        br.close();
        bw.flush();

    }
}
