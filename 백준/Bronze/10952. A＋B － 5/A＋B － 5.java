import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			if (
				a < 0 || a >= 10 ||
				b < 0 || b >= 10
				) {
				bw.write("0 < A, B < 10\n");
				bw.flush();
				bw.close();
				return;
			}
			
			if (a == 0 && b == 0) {
				break;
			} else {
				int c = a + b;
				bw.write(c + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
