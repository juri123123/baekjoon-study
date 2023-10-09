import java.util.*;
import java.io.*;

public class b1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        input = br.readLine();
        st = new StringTokenizer(input);

        for(int i=0; i<m; i++) {
            int k = Integer.parseInt(st.nextToken());
            binarySearch(arr, k);

            if(binarySearch(arr, k)) {
                bw.write(1+ "\n");
            } else {
                bw.write(0 + "\n");
            }
        }
        

        br.close();
        bw.flush();
    }

    public static boolean binarySearch(int []arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid;
		while(start <= end) {
			mid =  (start + end) / 2;
			
			if(arr[mid] == target) return true;
			else if(arr[mid] < target) {
				start = mid + 1;
			}
			else if(arr[mid] > target) {
				end = mid - 1;
			}
		}
		return false;
	}

}
