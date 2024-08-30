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
		
		// 첫째 줄 현재 시각 입력
		String s[] = br.readLine().split(" ");
		int hour = Integer.parseInt(s[0]);
		int minute = Integer.parseInt(s[1]);
		// 조건 불충 출력
		if (hour < 0 || hour > 23) {
			bw.write("0 ≤ A ≤ 23\n");
			bw.flush();
		}
		if (minute < 0 || minute > 59) {
			bw.write("0 ≤ B ≤ 59\n");
			bw.flush();
		}
		
		// 둘째 줄 요리하는 데 필요한 시간 입력
		int cookingTime = Integer.parseInt(br.readLine());
		// 조건 불충 출력
		if (cookingTime < 0 || cookingTime > 1000) {
			bw.write("0 ≤ C ≤ 1,000\n");
			bw.flush();
			bw.close();
			return;
		}
		
		
		int addTime = minute + cookingTime;
		int addHour = addTime / 60;
		int remainMinute = addTime % 60;
		int resultHour = hour + addHour;
		// 조건
		if (addTime < 60) {
			bw.write(hour + " " + addTime);
		} else if (resultHour >= 24) {
				bw.write((resultHour - 24) + " " + remainMinute);
		} else {
				bw.write(resultHour + " " + remainMinute);
		}
		
		bw.flush();
		bw.close();
	}

}
