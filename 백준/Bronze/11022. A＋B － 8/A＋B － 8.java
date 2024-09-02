import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int testCount = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCount; i++) {
			String s[] = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			if (a <= 0 || a >= 10 || 
				a <= 0 || a >= 10) {
					bw.write("0 < A, B < 10\n");
					bw.flush();
					bw.close();
					return;
			}
			
			int c = a + b;
			bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + c + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
