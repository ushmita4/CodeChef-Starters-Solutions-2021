import java.io.*;
import java.util.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int R=sc.ni();
        int O=sc.ni();
        int C=sc.ni();
        
        int score=(20-O)*6*6;
        
        if((score+C)>R)
        pw.println("YES");
        else
        pw.println("NO");
        
        pw.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }
    }
}
