import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int score = Integer.parseInt(s);
		
		if (score < 0 || score > 100) {
			bw.write("시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수입니다.\n");
		} else if (score >= 90) {
			bw.write("A\n");
		} else if (score >= 80) {
			bw.write("B\n");
		} else if (score >= 70) {
			bw.write("C\n");
		} else if (score >= 60) {
			bw.write("D\n");
		} else {
			bw.write("F\n");
		}
		bw.flush();
		bw.close();
	}

}
