import java.util.*;
import java.io.*;

public class b12015{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(num > list.get(list.size()-1)) {
                list.add(num);
            } else {
                binarySearch(list, num);
            }

            
        }
        
        bw.write(list.size() - 1 + "\n");
        br.close();
        bw.flush();
    }
//x 찾기! x보다 작은 원소의 개수 = k개
//
    public static void binarySearch(ArrayList<Integer> list, int n) {
		int start = 1;
		int end = list.size() - 1;
		int mid = 0;
        int result = 0;

		while(start <= end) {
			mid =  (start + end) / 2;
            
			if(list.get(mid) < n) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;     
            }
		}

        list.set(result, n);
	}

}
