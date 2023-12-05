import java.util.*;
import java.io.*;
//증가하는 부분 수열의 길이 값 최대, 감소하는 부분 수열의 길이 값 최대!
public class b2565 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][2];

        String input;
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //왼쪽 전봇대에서의 번호 순으로 정렬
        Arrays.sort(arr, Comparator.comparing(a -> a[0]));

        dp = new Integer[n];
        int max = 0;

        for(int i=0; i<n; i++) {
            max = Math.max(topDown(i), max);
        }

        //n-최대값
        bw.write(n-max + "\n");

        br.close();
        bw.flush();
    }

    static int topDown(int n) {

        if(dp[n] == null) {
            dp[n] = 1;

            //A의 n번째와 이후의 전봇대를 비교
            //A의 n번째 전선이 연결된 B보다
            //A의 i번째 전선이 연결된 B가 뒤에 있을 경우 설치!
            for(int i=n+1; i<dp.length; i++) {
                if(arr[n][1] < arr[i][1]) {
                    //연결 가능한 전선의 경우의 수 중 큰 값 저장
                    dp[n] = Math.max(dp[n], topDown(i) + 1);
                }
            }
        }
        return dp[n];

    }


}
