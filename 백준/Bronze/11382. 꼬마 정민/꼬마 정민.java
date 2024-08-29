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
		
		long num1 = Long.parseLong(split[0]);
		long num2 = Long.parseLong(split[1]);
		long num3 = Long.parseLong(split[2]);
		
		final long MAX_LIMIT = 1000000000000L;
		if (num1 < 1 || num1 > MAX_LIMIT || num2 < 1 || num2 > MAX_LIMIT || num3 < 1 || num3 > MAX_LIMIT) {
			bw.write("1 ≤ A, B, C ≤ 10^12\n");
			bw.flush();
			bw.close();
			return;
		}
		
		long result = num1 + num2 + num3;
		bw.write(result +"\n");
		bw.flush();
		bw.close();
	}

}