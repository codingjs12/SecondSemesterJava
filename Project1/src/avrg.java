import java.util.Scanner;
public class avrg {

	public static void main(String[] args) {
		int value;
		int sum =0;
		Scanner s = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요");
		for(int i=0; i<5;i++) {
			value = s.nextInt();
			if(value < 0) continue;
			sum += value;
		}
		s.close();
		System.out.println("합은: " + sum);
	}
}
