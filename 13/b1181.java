import java.io.*;
import java.util.*;

public class b1181{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
       
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            if(list.contains(input)){
                continue;
            } else {
                list.add(input);
            }
            
        }

         String[] arr = list.toArray(new String[list.size()]);

        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }

        });
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        br.close();
        bw.flush();

    }
}
