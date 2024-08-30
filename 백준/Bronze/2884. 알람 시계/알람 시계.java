import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s[] = br.readLine().split(" ");
		int hour = Integer.parseInt(s[0]);
		int minute = Integer.parseInt(s[1]);
		
		if ((hour < 0 || hour > 23) || (minute < 0 || minute > 59)) {
			bw.write("0 ≤ H ≤ 23, 0 ≤ M ≤ 59\n");
		} else if (minute >= 45) {
			bw.write(hour + " " + (minute - 45));
		} else if (minute < 45 && hour == 0) {
			bw.write((hour + 23) + " " + (minute + 15));
		} else {
			bw.write((hour - 1) + " " + (minute + 15));
		}
		
		bw.flush();
		bw.close();
	}

}
