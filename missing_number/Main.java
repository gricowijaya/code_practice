
// question link :  https://cses.fi/problemset/task/1083
import java.io.*;
import java.util.*;

class template {
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            // for Short Input lesser file memory
            br = new BufferedReader(new InputStreamReader(stream), Short.MAX_VALUE);
            st = null;
        }

        // for String input
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        // for Integer input
        public int nextInt() {
            return Integer.parseInt(next());
        }

        // for Long input
        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}

public class Main {

    // method for searching the missing number you can see
    // the algorithm explanation right here :
    // https://atomiclotus.net/algorithms/find-missing-number-algorithm/
    public static long missing_number(long sum, long n) {
        return ((n * (n + 1)) / 2) - sum;
    }

    public static long sum = 0;

    public static void main(String[] args) throws IOException {
        // creating new object
        template.InputReader in = new template.InputReader(System.in);
        ArrayList<Long> numbers = new ArrayList<Long>();
        PrintWriter p = new PrintWriter(System.out);

        // input how many test case
        long n = in.nextLong();
        long t;

        // element for the array
        for (long i = 0; i < n - 1; i++) {
            // input element
            t = in.nextLong();
            // add it to the array
            numbers.add(t);
        }

        // to sum the every element so we can pass it to the missing_number method
        for (long element : numbers)
            sum += element;

        // print the missing number by invoking the method we just created
        p.print(missing_number(sum, n));

        // to see detail uncomment this block
        /*
         * p.println("sum " + sum);
         * 
         * p.print("element "); for (long element : numbers) { p.print("[" + element +
         * "]"); } p.println("\nmissing " + missing_number(sum, n));
         * 
         */

        // don't forget p.close() otherwise you will not get any output
        p.close();
    }
}
