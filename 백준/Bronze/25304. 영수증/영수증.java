import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int totalAmount = Integer.parseInt(br.readLine());
		int itemCount = Integer.parseInt(br.readLine());
		int price = 0;
		int quantity = 0;
		int amount = 0;
		for (int i = 0; i < itemCount; i++) {
			String s[] = br.readLine().split(" ");
			price = Integer.parseInt(s[0]);
			quantity = Integer.parseInt(s[1]);
			amount = amount + (price * quantity);
		}
		
		if (
			totalAmount < 1 || totalAmount > 1000000000 ||
			itemCount < 1 || itemCount > 100 ||
			price < 1 || price > 1000000 ||
			quantity < 1 || quantity > 10
				) {
			bw.write("1 <= totalAmount <= 1,000,000,000\n");
			bw.write("1 <= itemCount <= 100\n");
			bw.write("1 <= price <= 1,000,000\n");
			bw.write("1 <= quantity <= 10\n");
			bw.flush();
			bw.close();
			return;
		}
		
		if (amount == totalAmount) {
			bw.write("Yes\n");
		} else {
			bw.write("No\n");
		}
		bw.flush();
		bw.close();
	}

}
