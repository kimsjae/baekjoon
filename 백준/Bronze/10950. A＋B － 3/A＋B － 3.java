import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCount; i++) {
			String s[] = br.readLine().split(" ");
			int num1 = Integer.parseInt(s[0]);
			int num2 = Integer.parseInt(s[1]);
			if (
				num1 < 1 || num1 > 9 ||
				num2 < 1 || num2 > 9
					) {
				bw.write("0 < A, B < 10\n");
			} else {
				bw.write(num1 + num2 +"\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
