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
		int front = Integer.valueOf(split[0]);
		int back = Integer.valueOf(split[1]);
		if (front < 0 || front > 10 || back < 0 || back > 10) {
			bw.write("0 < A, B < 10\n");
			bw.flush();
			bw.close();
		} else {
			int sum = front + back;
			
			bw.write(sum + "\n");
			bw.flush();
			bw.close();
		}
		
	}

}