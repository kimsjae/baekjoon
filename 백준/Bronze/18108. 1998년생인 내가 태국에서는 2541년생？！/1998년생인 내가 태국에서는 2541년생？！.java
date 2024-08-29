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
		int buddhistYear = Integer.parseInt(s);
		if (buddhistYear < 1000 || buddhistYear > 3000) {
			bw.write("1000 <= y <= 3000\n");
			bw.flush();
			bw.close();
			return;
		}
		int gregorianYear = buddhistYear - 543;
		bw.write(gregorianYear + "\n");
		bw.flush();
		bw.close();
		return;
	}

}