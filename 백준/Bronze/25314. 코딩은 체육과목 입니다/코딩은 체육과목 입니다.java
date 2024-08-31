import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정수 N 입력 (4 <= N <= 1,000; N은 4의 배수)
		int num;
		
		// N 예외처리
		while(true) {
			num = Integer.parseInt(br.readLine());
			
			if (
				num < 4 || 
				num > 1000 ||
				num % 4 != 0
				) {
					bw.write("4 <= N <= 1,000; N은 4의 배수\n");
					bw.write("다시 정수 N을 입력해주세요.\n");
					bw.flush();
			} else {
				break;
			}
		}
		
		// long 개수
		int longCount = num / 4;
		
		for (int i = 0; i < longCount; i++) {
			bw.write("long ");
		}
		bw.write("int\n");
		bw.flush();
		bw.close();
	}

}
