import java.util.*;
import java.io.*;

public class b2110{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());//집의 수
        int c = Integer.parseInt(st.nextToken());//공유기의 수
        long[] arr = new long[n];

        for(int i=0; i<n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);
        
        long result = binarySearch(arr, c);
        bw.write(result + "\n");
        br.close();
        bw.flush();
    }
//집 사이의 거리 - 직전 집의 거리와 현재 집의 거리를 비교
    public static long binarySearch(long[] arr, int c) {
		long start = 1;
		long end = arr[arr.length-1] - arr[0]; 
		long mid = 0;
        long count = 0;
        long result = 0;

		while(start <= end) {
			mid =  (start + end) / 2;
			count = 1;
            long origin = arr[0];
            for(int i=1; i<arr.length; i++) {
                if(arr[i] - origin >= mid) {
                    count++;
                    origin = arr[i];
                }
            }
            //System.out.println("길이 : " + count + " mid: " + mid);
            //거리를 좁혀야 함!
			if(count >= c) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
		}

		return result;
	}

}
