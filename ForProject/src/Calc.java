
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		
		do {
			i = i +1;
			if(i % 2 != 0) continue;
			sum += i; 
			
		} while(i<10);
		System.out.println(sum);

	}

}
