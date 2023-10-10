import java.util.*;
import java.io.*;

public class b1654{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long[] arr = new long[k];
        long max = 0;
        for(int i=0; i<k; i++) {
            arr[i] = Long.parseLong(br.readLine());
            if(max < arr[i]) max = arr[i];
        }

        long result = binarySearch(arr, max, n);
        bw.write(result + "\n");
        br.close();
        bw.flush();
    }
//자를 수 있는 선의 최대 길이를 이분 탐색으로 찾음
    public static long binarySearch(long []arr, long max, int n) {
		long start = 1;
		long end = max;
		long mid = 0;
        long count = 0;

		while(start <= end) {
			mid =  (start + end) / 2;
			count = 0;
            for(int i=0; i<arr.length; i++) {
                count += arr[i] / mid;
            }
            //선의 길이가 더 작아져야함
			if(count < n) {
                end = mid -1;
            } // 선의 길이가 더 커져야함
			else {
                start = mid + 1;
            }
		}

		return (start+end)/2;
	}

}
