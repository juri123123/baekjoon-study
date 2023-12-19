import java.util.*;
import java.io.*;
public class b10431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list;
        
        
        for(int i=0; i<T; i++) {
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();
            int t = Integer.parseInt(st.nextToken());
            list.add(Integer.parseInt(st.nextToken()));
            for(int j=1; j<20; j++) {
                int n = Integer.parseInt(st.nextToken());
                int count = 0;
                int flag = 1;
                
                //System.out.println("size " + list.size());
                for(int k=0; k<list.size(); k++) {
                    if(n < list.get(k)) {
                        result += (list.size() - count); 
                        list.add(count, n);
                        flag = 0;
                        break;
                    } else {
                        count++;
                    }
                    
                }
                if(flag == 1) {
                    list.add(n);
                }
                
                //System.out.println("result " + result);
            }
            //System.out.println();
            bw.write(t + " " + result + "\n");
        }

        br.close();
        bw.flush();
    }

}
