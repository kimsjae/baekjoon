import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String id = br.readLine();
		if (id.length() > 50) {
			bw.write("아이디는 50자를 넘을 수 없습니다.\n");
			bw.flush();
			bw.close();
			return;
		}
		
		if (!id.matches("^[a-z]*$")) {
			bw.write("아이디는 소문자만 허용됩니다.\n");
            bw.flush();
            bw.close();
            return;
		}
		
		bw.write(id + "??!\n");
		bw.flush();
		bw.close();
		return;
	}

}