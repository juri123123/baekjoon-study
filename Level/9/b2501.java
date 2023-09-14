import java.io.*;
import java.util.*;

public class b2501{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int i = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(n == 1) {
            System.out.println(1);
        } else {
            while(i <= n) {
                if (n % i == 0){
                    list.add(i);
                    //System.out.print(i + " ");
                }
                i++;
            }
            if(list.size() < k){
                System.out.println(0);
            } else {
                System.out.println(list.get(k-1));
            }
            

        }



       
              
        br.close();
        bw.flush();

    }
}
