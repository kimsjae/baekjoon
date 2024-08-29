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
		int num1 = Integer.valueOf(split[0]);
		int num2 = Integer.valueOf(split[1]);
		
		if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10) {
			bw.write("0 < A, B < 10\n");
			bw.flush();
			bw.close();
		} else {
			int difference = num1 - num2;
			
			bw.write(difference + "\n");
			bw.flush();
			bw.close();
		}
	}

}