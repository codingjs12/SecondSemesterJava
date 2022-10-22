import java.util.Scanner;
class BookArray {
	String title;
	String author;
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		BookArray [] Array = new BookArray[2];
		
		for(int i = 0; i < 2; i++) {
		
			Array[i] = new BookArray();
		
			System.out.print("제목:");
			Array[i].title = s.next();
		
			System.out.print("저자:");
			Array[i].author = s.next();
		
			System.out.print(Array[i].title+Array[i].author);
			
		
		}
		s.close();
	}
}
