import java.util.Scanner;
class Rectangle {
	int height, width;
	int getArea() {
		int area = height * width;
		return area;
	}
}
public class RectApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("너비와 높이를 입력하세요.");
		Rectangle square = new Rectangle();
		square.width = s.nextInt();
		square.height = s.nextInt();
		square.getArea();
		
		s.close();
		
		System.out.println(square.getArea());
	}

}
