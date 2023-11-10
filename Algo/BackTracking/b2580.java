import java.io.*;
import java.util.*;

public class b2580{
    static int n;
    static int m;
    static int[][] arr;
    static boolean[] flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        arr = new int[9][9];

        for (int i=0; i<9; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        tracking(0, 0);
        // bw.write("\n");

        // for(int i=0; i<9; i++) {
        //     for(int j=0; j<9; j++) {
        //         bw.write(arr[i][j] + " ");
        //     }
        //     bw.write("\n");
        // }

        br.close();
        bw.flush();

    }

    static void tracking(int x, int y) {
        if(y == 9) {
            tracking(x+1, 0);
            return;
        }
        if(x == 9) {
            StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			
			System.exit(0);
            //return;
        }

        if(arr[x][y] == 0) {
            for(int i=1; i<=9; i++) {
                if (check(x, y, i)) {
                    arr[x][y] = i;
                    tracking(x, y+1);
                }
            }
            arr[x][y] = 0;
            return;
        }

        tracking(x,y+1);
        

    }

    static boolean check(int x, int y, int value) {
 
        //열 검사

        for(int i=0; i<9; i++) {
            if(arr[x][i] == value) {
                return false;
            }
        }
       
        //열 검사
        for(int i=0; i<9; i++) {
            if(arr[i][y] == value) {
                return false;
            }
        }
        
        //3x3 검사
        int X = (x/3)*3; //속한 3x3 행의 첫 위치
        int Y = (y/3)*3;

        for (int i=X; i<X+3; i++) {
            for(int j=Y; j<Y+3; j++) {
                if(arr[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    } 
}
