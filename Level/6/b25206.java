        import java.io.*;
        import java.util.*;

        public class b25206{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                double total = 0;
                double sum = 0;

                for(int i=0; i<20; i++) {
                    String input = br.readLine();
                    StringTokenizer st = new StringTokenizer(input);
                    String name = st.nextToken();
                    double count = Double.parseDouble(st.nextToken());
                    total += count;
                    String grade = st.nextToken();
                    switch(grade){
                        case "A+": 
                            sum += 4.5 * count;
                            break;
                        case "A0":
                            sum += 4.0 * count;
                            break;
                        case "B+":
                            sum += 3.5 * count;
                            break;
                        case "B0":
                            sum += 3.0 * count;
                            break;
                        case "C+":
                            sum += 2.5 * count;
                            break;
                        case "C0":
                            sum += 2.0 * count;
                            break;
                        case "D+":
                            sum += 1.5 * count;
                            break;
                        case "D0":
                            sum += 1.0 * count;
                            break;
                        case "F":
                            break;
                        case "P":
                            total -= count;
                            break;
                    }
                }

                double avg = sum / total;
                System.out.println(sum);
                System.out.println(total);
                System.out.println(avg);
               
                br.close();
                bw.flush();

            }
        }
        