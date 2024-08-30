import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 주사위 눈 세 개 입력 후 변수에 저장
		String s[] = br.readLine().split(" ");
		int num1 = Integer.parseInt(s[0]);
		int num2 = Integer.parseInt(s[1]);
		int num3 = Integer.parseInt(s[2]);
		
		// 조건
		if (num1 == num2 && num1 == num3) {
			bw.write(10000 + (num1 * 1000)+ "\n");
		} else if (
				num1 == num2 && num1 != num3 ||
				num1 == num3 && num1 != num2 ||
				num2 == num3 && num1 != num2
				) {
			if (num1 == num2) {
				bw.write(1000 + (num1 * 100) + "\n");
			} else if (num1 == num3) {
				bw.write(1000 + (num1 * 100) + "\n");
			} else {
				bw.write(1000 + (num2 * 100) + "\n");
			}
		} else {
			if (num1 > num2 && num1 > num3) {
				bw.write(num1 * 100 + "\n");
			} else if (num2 >num1 && num2 > num3) {
				bw.write(num2 * 100 + "\n");
			} else {
				bw.write(num3 * 100 + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
