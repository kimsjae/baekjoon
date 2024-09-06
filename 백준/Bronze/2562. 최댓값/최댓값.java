import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int[] num = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if (num[i] > max) {
				max = num[i];
				index = i + 1;
			}
		}
		
		bw.write(max + "\n");
		bw.write(index + "\n");
		bw.flush();
		bw.close();
	}

}
