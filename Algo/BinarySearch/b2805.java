import java.util.*;
import java.io.*;

public class b2805{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());//나무의 수
        long m = Integer.parseInt(st.nextToken());//필요한 나무의 길이
        long[] arr = new long[n];
        long max = 0;

        input = br.readLine();
        st = new StringTokenizer(input);
        for(int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            if(max < arr[i]) max = arr[i];
        }
        long result = binarySearch(arr, max, m);
        bw.write(result + "\n");
        br.close();
        bw.flush();
    }

    public static long binarySearch(long[] arr, long max, long n) {
		long start = 0;
		long end = max;
		long mid = 0;
        long len = 0;

		while(start <= end) {
			mid =  (start + end) / 2;
			len = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] > mid) {
                    len += (arr[i] - mid);
                }
            }
            //System.out.println("길이 : " + len + " mid: " + mid);
			if(len < n) {
                end = mid - 1;
            } else if (len > n){
                start = mid + 1;
            } else {
                return mid;
            }
		}

        if(len < n) {
            return mid - 1;
        }

		return mid;
	}

}
