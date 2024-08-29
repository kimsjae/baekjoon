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
		double num1 = Integer.valueOf(split[0]);
		double num2 = Integer.valueOf(split[1]);
		
		if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10) {
			bw.write("0 < A, B < 10\n");
			bw.flush();
			bw.close();
		} else {
			double quotient = num1 / num2;
			
			bw.write(quotient + "\n");
			bw.flush();
			bw.close();
		}
	}

}