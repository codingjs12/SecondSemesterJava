import java.util.Scanner;
public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String eng[] = {"student", "love", "java","happy", "future" };
		String kor[] = {"학생", "사랑", "자바","행복한", "미래" };
		
		String string;
		
		System.out.println("영어단어를 입력하세요");
		string = s.next();
		while(true) {
			if(string.equals("student")) {
				System.out.println("학생");
			break;
			}
			if(string.equals("love")) {
				System.out.println("사랑");
			break;
			}
			if(string.equals("java")) {
				System.out.println("자바");
			break;
			}
			if(string.equals("happy")) {
				System.out.println("행복한");
			break;
			}
			if(string.equals("happy")) {
				System.out.println("미래");
			break;
			}
			if(string.equals("exit"))
			break;
		}
		
	s.close();
	}

}
