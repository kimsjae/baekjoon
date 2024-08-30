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
		String split[] = s.split(" ");
		int num1 = Integer.parseInt(split[0]);
		int num2 = Integer.parseInt(split[1]);
		
		if (num1 < -10000 || num2 < -10000 || num1 > 10000 || num2 > 10000) {
			bw.write("-10,000 ≤ A, B ≤ 10,000\n");
		} else if (num1 > num2) {
				bw.write(">\n");
		} else if (num1 < num2) {
				bw.write("<\n");
		} else {
				bw.write("==\n");
		}
		
		bw.flush();
		bw.close();
	}

}
