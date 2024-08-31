import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N을 입력 받는다.
		while(true) {
			int num;
			num = Integer.parseInt(br.readLine());
			
			// N이 1보다 크거나 같고, 9보다 작거나 같으면 N*1부터 N*9까지 출력한다.
			if (num >= 1 && num <= 9) {
				for (int i = 1; i < 10; i++) {
					bw.write(num + " * " + i + " = " + (num * i) + "\n");
				}
				bw.flush();
				break;
			} 
			// 그렇지 않다면, 다시 N을 입력 받는다.
			  else {
				  bw.write("N은 1보다 크거나 같고, 9보다 작거나 같습니다.\n");
				  bw.write("다시 N을 입력해주세요.\n");
				  bw.flush();
			  }
		}
		bw.close();
	}

}
