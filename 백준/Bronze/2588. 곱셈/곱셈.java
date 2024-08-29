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
		int num0 = Integer.parseInt(s);
		String ss = br.readLine();
		String ss1 = ss.substring(0, 1);
		String ss2 = ss.substring(1, 2);
		String ss3 = ss.substring(2, 3);
		int num1 = Integer.parseInt(ss1);
		int num2 = Integer.parseInt(ss2);
		int num3 = Integer.parseInt(ss3);
		
		int result1 = num0 * num3;
		int result2 = num0 * num2;
		int result3 = num0 * num1;
		int result4 = result1 + (result2 * 10) + (result3 * 100);
		bw.write(result1 + "\n");
		bw.write(result2 + "\n");
		bw.write(result3 + "\n");
		bw.write(result4 + "\n");
		bw.flush();
		bw.close();
		return;
	}

}
