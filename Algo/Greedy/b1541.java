import java.util.*;
import java.io.*;

public class b1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        //-기준으로 나누고 나머지는 다 더함.
        //그리고 첫번째 수에서 나머지 다 빼기
        
        String[] sumList = input.split("-");
        ArrayList<Integer> list = new ArrayList<>();

        // for(int i=0; i<sumList.length; i++) {
        //     System.out.print(sumList[i] + " ");
        // }

        for(int i=0; i<sumList.length; i++) {
            int num = 0;
            if(sumList[i].contains("+")) {
                //System.out.println(sumList[i]);
                String[] numList = sumList[i].split("\\+");
                for(int j=0; j<numList.length; j++) {
                    num += Integer.parseInt(numList[j]);
                }
            } else {
                num = Integer.parseInt(sumList[i]);
            }

            list.add(num);
        }
        int result = list.get(0);
        for(int i=1; i<list.size(); i++) {
            result -= list.get(i);
        }

        bw.write(result + "\n");


        br.close();
        bw.flush();
    }
}
