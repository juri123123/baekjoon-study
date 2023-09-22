import java.util.*;
import java.io.*;

public class b1931 {

    static class Meeting implements Comparable<Meeting> {

        int start;
        int end;
        
        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        //회의 종료 시간을 오름차순으로 정렬
        //만약 종료 시간이 같다면 시작 시간이 빠른 회의를 선택
        @Override
        public int compareTo(Meeting o) {
            if(this.end > o.end) return 1;
            else if(this.end < o.end) return -1;
            else return this.start - o.start;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Meeting> list = new ArrayList<Meeting>();

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new Meeting(start, end));

        }

        Collections.sort(list);

        int count = 0;
        int time = 0;

        for(int i=0; i<list.size(); i++) {
            if(time <= list.get(i).start) {
                time = list.get(i).end;
                count++;
            }
        }

        System.out.println(count);

        br.close();
        bw.flush();
    }
}
