import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정수의 개수 (1 <= N <= 100) 입력
		int n = Integer.parseInt(br.readLine());
		
		// 정수가 공백으로 구분되어져 있다.
		String s = br.readLine();
		String[] split = s.split(" ");
		
		// 찾으려고 하는 정수 v가 주어진다.
		int v = Integer.parseInt(br.readLine());
		
		// 출력
		int count = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(split[i]);
			if (a == v) {
				count++;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
		
	}

}
