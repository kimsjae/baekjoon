import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int num = Integer.parseInt(br.readLine());
		if (num < 1 || num > 100) {
			bw.write("1 ≤ N ≤ 100\n");
			bw.flush();
			bw.close();
			return;
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
