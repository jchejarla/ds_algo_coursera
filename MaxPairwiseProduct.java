import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MaxPairwiseProduct {
	
	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		long[] numbers = new long[n];
		int index1 = 0;
		for (int i=0;i<n;i++) {
			numbers[i] = scanner.nextInt(); 
			if(numbers[index1]<numbers[i]) {
				index1=i;
			}
		}
		
		int index2=0;
		if(index1==0) {
			index2=1;
		}
		
		for(int j=0;j<n;j++) {
			if(j!=index1 && numbers[index2]<numbers[j]) {
				index2=j;
			}
		}
		
		System.out.println(numbers[index1]*numbers[index2]);
	}

	
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }
}
