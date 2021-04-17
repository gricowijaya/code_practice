import java.util.StringTokenizer;
import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter p = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());

        long n = Long.parseLong(st.nextToken());

        p.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                // for even number
                n /= 2;
            } else {
                // for odd number
                n = n * 3 + 1;
            }
            p.print(n + " ");
        }

        p.close();
    }
}
