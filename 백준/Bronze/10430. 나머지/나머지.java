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
		int num3 = Integer.parseInt(split[2]);
		if (num1 < 2 || num1 > 10000 || num2 < 2 || num2 > 10000 || num3 < 2 || num3 > 10000 ) {
			bw.write("2 <= A, B, C <= 10000\n");
			bw.flush();
			bw.close();
			return;
		}
		int result1 = (num1 + num2) % num3;
		int result2 = ((num1 % num3) + (num2 % num3)) % num3;
		int result3 = (num1 * num2) % num3;
		int result4 = ((num1 % num3) * (num2 % num3)) % num3;
		bw.write(result1 + "\n");
		bw.write(result2 + "\n");
		bw.write(result3 + "\n");
		bw.write(result4 + "\n");
		bw.flush();
		bw.close();
		return;
	}

}