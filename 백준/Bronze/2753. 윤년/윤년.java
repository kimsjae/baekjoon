import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int year = Integer.parseInt(br.readLine());
		
		if (year < 1 || year > 4000) {
			bw.write("연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수입니다.\n");
		} else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			bw.write("1\n");
		} else {
			bw.write("0\n");
		}
		
		bw.flush();
		bw.close();
	}

}
