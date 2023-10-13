import java.util.*;
import java.io.*;

public class b1300{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long k = Long.parseLong(br.readLine());
        
        long result = binarySearch(k, n);
        
        bw.write(result + "\n");
        br.close();
        bw.flush();
    }
//x 찾기! x보다 작은 원소의 개수 = k개
//
    public static long binarySearch(long k, int n) {
		long start = 1;
		long end = k;
		long mid = 0;
        long count = 0;
        long result = 0;

		while(start <= end) {
			mid =  (start + end) / 2;
            count = 0;
            //2차원배열에서 각 행마다 찾고자 하는 x로 나눠주고 합해주면 됨
            for(int i=1; i<=n; i++) {
                count += Math.min(mid/i, n);
            }
        
			if(count < k) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;     
            }
		}

		return result;
	}

}
