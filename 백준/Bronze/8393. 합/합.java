import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		if (num < 1 || num > 10000) {
			bw.write("1 ≤ n ≤ 10,000\n");
		} else {
			int answer = 0;
			for (int i = 1; i <= num; i++) {
				answer = answer + i;
			}
			bw.write(answer + "\n");
		}
		bw.flush();
		bw.close();
	}

}
