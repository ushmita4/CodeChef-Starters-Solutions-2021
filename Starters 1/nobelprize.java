import java.io.*;
import java.util.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
       int T=sc.ni();
       for(int t=0;t<T;t++){
           int N=sc.ni();
           int M=sc.ni();
           int a[]=new int[N];
           HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
           int c=0;
           for(int i=0;i<N;i++){
               a[i]=sc.ni();
               if(map.containsKey(a[i])){
                    
                }else{
                    map.put(a[i],1);
                    c++;
                }
           }
           if(c<M)
           pw.println("YES");
           else 
           pw.println("NO");
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
