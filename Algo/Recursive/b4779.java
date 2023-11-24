import java.io.*;
import java.util.*;

public class b4779{
    static int n;
    static char[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String str;
        while((str = br.readLine()) != null){ //입력이 없을 때 까지 ㄱㄱ
            n = Integer.parseInt(str); //N

            int cnt = (int) Math.pow(3,n); //3의 N 제곱 구하기
            arr = new char[cnt]; //char 배열 생성

            for(int i=0;i<cnt;i++) arr[i] = '-'; //char배열에 - 로 채워주기

            recursion(0,cnt);

            for(int i=0;i<cnt;i++) bw.write(arr[i]);
            bw.write("\n");
            bw.flush();
        }


        br.close();
        bw.flush();

    }

    public static void recursion(int start, int size) {

        if(size < 3) {
            return;
        }

        int newSize = size/3;
        for(int i=start + newSize; i<start+2*newSize; i++) {
            arr[i] = ' ';
        }

        recursion(start, newSize);
        recursion(start+2*newSize, newSize);

    }
}
