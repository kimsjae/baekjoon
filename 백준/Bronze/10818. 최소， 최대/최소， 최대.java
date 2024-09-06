import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		while(n < 1 || n > 1000000) {
			bw.write("1 ≤ N ≤ 1,000,000\n");
			bw.flush();
			n = Integer.parseInt(br.readLine());
		}
		
		String[] s = br.readLine().split(" ");
		int[] num = new int[n];
		int min = 1000001;
		int max = -1000001;
		for (int i = 0; i < s.length; i++) {
			num[i] = Integer.parseInt(s[i]);
			
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		
	}

}
