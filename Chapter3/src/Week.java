import java.util.InputMismatchException;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String day[] = {"월","화","수","목","금","토","일"};
		int value;
		try {
			while(true) {
			System.out.println("정수를 입력하세요");
			value = s.nextInt();
			switch(value % 7) {
			case 0:
				System.out.println(day[0]);
				break;
			case 1:
				System.out.println(day[1]);
				break;
			case 2:
				System.out.println(day[2]);
				break;
			case 3:
				System.out.println(day[3]);
				break;
			case 4:
				System.out.println(day[4]);
				break;
			case 5:
				System.out.println(day[5]);
				break;
			case 6:
				System.out.println(day[6]);
				break;
				}
			if(value < 0) {
				System.out.println("종료합니다.");
				break;
				}
			}
		}
		
		
			catch(InputMismatchException e) {
				System.out.println("잘못입력");
			}
			
			finally {
				s.close();
			}
		}
	}

