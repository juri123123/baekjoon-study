import java.io.*;
import java.util.*;

public class b10815{
    static int n;
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        // ArrayList<Integer> list = new ArrayList<Integer>();
        arr = new int[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //오름차순 정렬
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);

        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if(binarySearch(num)) bw.write(1 + " ");
            else bw.write(0 + " ");
        }
        
        br.close();
        bw.flush();

    }

    //이분탐색
    private static boolean binarySearch(int num) {
        int left = 0;
        int right = n-1;

        while(left <= right) {
            int midIndex = (left + right) / 2;
            int mid = arr[midIndex];

            if(num < mid) {
                right = midIndex - 1;
            } else if(num > mid) {
                left = midIndex + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
