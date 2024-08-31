import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트케이스의 개수 T 입력. T는 최대 1,000,000이다.
		int testCount;
		testCount = Integer.parseInt(br.readLine());
		// T 예외처리
		while(true) {
			if (testCount > 1000000) {
				bw.write("T는 최대 1,000,000입니다.\n");
				bw.flush();
				testCount = Integer.parseInt(br.readLine()); 
			} else {
				break;
			}
		}
		
		// 두 정수 A와 B 입력. A와 B는 1 이상 1,000 이하이다.
		for (int i = 0; i < testCount; i++) {
			String s[] = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			// 각 테스트케이스마다 A + B를 한 줄에 하나씩 순서대로 출력.
			bw.write(a + b + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
