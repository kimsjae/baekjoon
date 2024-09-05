import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while((s = br.readLine()) != null) {
        	String[] split = s.split(" ");
        	int a = Integer.parseInt(split[0]);
        	int b = Integer.parseInt(split[1]);
        	bw.write(a + b + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
