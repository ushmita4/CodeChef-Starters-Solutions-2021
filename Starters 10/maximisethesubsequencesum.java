import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        int T = sc.ni();
        for (int t = 0; t < T; t++) {
             int n=sc.ni();
             int k=sc.ni();
             int sum=0;
             int a[]=new int[n];
             for(int i=0;i<n;i++)
             {
                 a[i]=sc.ni();
             }
             Arrays.sort(a);
             for(int i=0;i<k;i++)
             {
                if(a[i]>0)
                break;
                else
                a[i]=-1*a[i];
             }
             for(int i=0;i<n;i++)
             {
                 if(a[i]>0)
                 sum=sum+a[i];
             }
             pw.println(sum);
        }
        
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
