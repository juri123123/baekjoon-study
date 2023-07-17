import java.io.*;
import java.util.*;

public class b9506{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while(true) {
            int i = 1;
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            n = Integer.parseInt(br.readLine());
            if(n == -1) {
                break;
            }
            while(i < n) {
                if(n%i == 0){
                    list.add(i);
                    sum += i;
                   
                }
                i++;
            }
            //System.out.println(sum);
            if(sum == n) {
                bw.write(n + " = 1");
                for(int j=1; j<list.size(); j++) {
                    bw.write(" + " + list.get(j));
                }
                bw.write("\n");
            } else {
                bw.write(n+" is NOT perfect.\n");
            }
            
        }
        br.close();
        bw.flush();

    }
}
