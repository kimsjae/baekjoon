import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int[] num = new int[30];
		for (int i = 0; i < 28; i++) {
			int a = Integer.parseInt(br.readLine());
			num[a - 1] = 1;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 1) {
				bw.write((i + 1) + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
