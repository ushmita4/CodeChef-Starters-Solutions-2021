// Working program with FastReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 class Codechef2
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0)
        {
            int n = s.nextInt();
            int m = s.nextInt();
            long[] f = new long[n];
            long[] c = new long[m];
            for(int i=0;i<n;i++)
            {
                f[i] = s.nextLong();
            }
            for(int i=0;i<m;i++)
            {
                c[i] = s.nextLong();
            }
            int i=0,j=0;
            boolean s1 = true, s2 = false;
            long count = 0;
            while(i<n && j<m)
            {
                if(f[i]<c[j])
                {
                    if(!s1)
                        count++;

                    s1=true;
                    s2 = false;
                    i++;
                }
                else
                {
                    if(f[i]>c[j])
                    {
                        if(!s2)
                            count++;

                        s1=false;
                        s2 = true;
                        j++;
                    }
                }
            }
            System.out.println(count+1);
        }
    }
}



