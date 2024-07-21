// package HungryCow;

import java.io.*;
import java.util.StringTokenizer;

public class HungryCow {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] days = new int[N];
        int[] haybales = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(r.readLine());
            days[i] = Integer.parseInt(st.nextToken());
            haybales[i] = Integer.parseInt(st.nextToken());
        }

        pw.println("N: " + N + ", T: " + T);
        for (int i = 0; i < N; i++) {
            pw.println("Day: " + days[i] + ", Haybales: " + haybales[i]);
        }

        pw.close();
    }
}
