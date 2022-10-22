import java.util.InputMismatchException;
import java.util.Scanner;
public class Floor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
		System.out.println("정수를 입력하세요");
		
			int value = s.nextInt();
			if(value % 2 == 0) {
				System.out.println("짝수");
			}
			else 
				System.out.println("홀수");
			}
		catch (InputMismatchException e) {
			System.out.println("잘못입력");
			}
		finally {
			s.close();
		}
	}
}