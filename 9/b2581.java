import java.io.*;
import java.util.*;

public class b2581{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i=num1; i<=num2; i++) {
            int j = 2;
            int flag = 1;
            if(i==1) {

            }
            else if(i==2) {
                sum += i;
                count++;
                min = i;
            } else {
                while(j < i) {
                
                //System.out.println(i+" " + j);
                if(i%j == 0){
                    flag = 0;
                    break;
                }
                j++;
                
                }
                if(flag == 1) {
                    count++;
                    if(min > i) min = i;
                    sum += i;
                }
            }
            
        }
        if(count == 0) {
            System.out.println(-1);
        } else {
            bw.write(sum + "\n" + min);
        }
        
        br.close();
        bw.flush();

    }
}
