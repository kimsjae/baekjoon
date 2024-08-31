import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int i = Integer.parseInt(br.readLine());
            int a = i/4;
            for (int j = 0; j < a; j++) {
                bw.write("long ");
                if (j == a-1) {
                    bw.write("int\n");
                }
            }
            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}