class NewCircle {
	int radius;
	NewCircle(int radius) {
		this.radius = radius;
	}
public class Circle {
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCircle pizza = new NewCircle(10);
		increase(pizza);
		System.out.println(pizza.radius);
	}
	static void increase(NewCircle m) {
			m.radius++;
	}
}
