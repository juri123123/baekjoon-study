import java.io.*;
import java.util.*;

public class b1018{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];

        for(int i=0; i<n; i++) {
            String inputB = br.readLine();
            for(int j=0; j<m; j++) {
                board[i][j] = inputB.charAt(j);
            }
        }
        int count = 0;
        int flag = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<=n-8; i++) {
            for(int j=0; j<=m-8; j++) {
                if(board[i][j] == 'W') {
                    flag = 0;
                    for(int a=i; a<8+i; a++) {
                        if(a%2==0){
                            count=0;
                        } else {
                            count=1;
                        }
                        for(int b=j; b<8+j; b++) {
                            count++;
                            if(count%2 != 0 && board[a][b] == 'W') {
                                continue;
                            } else if(count%2 == 0 && board[a][b] == 'B') {
                                continue;
                            } else {
                                //System.out.println(a + " " + b);
                                flag++;
                            }
                            
                        }
                    }
                    System.out.println(i + " " + j + " " + flag);
                    if(min > flag) {
                        min = flag;
                        System.out.println(i + " " + j + " " + flag);
                    }

                } else {
                    flag = 0;
                    for(int a=i; a<8+i; a++) {
                        if(a%2==0){
                            count=1;
                        } else {
                            count=0;
                        }
                        for(int b=j; b<8+j; b++) {
                            count++;
                            if(count%2 != 0 && board[a][b] == 'B') {
                                continue;
                            } else if(count%2 == 0 && board[a][b] == 'W') {
                                continue;
                            } else {
                                //System.out.println((a+i) + " " + (b+j));
                                flag++;
                            }
                            
                        }
                    }
                    System.out.println(i + " " + j + " " + flag);
                    if(min > flag) {
                        min = flag;
                        System.out.println(i + " " + j+ " " + flag);
                    }
                }
            }
        }

        bw.write(min + "\n");
        br.close();
        bw.flush();

    }
}
