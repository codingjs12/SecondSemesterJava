
public class Song {
	
		String color;
		String gearType;
		int door;
		
	Song(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Song() {
		this("yellow","auto",4);
		System.out.println("디폴트 생성자 호출됌");
	}
	Song(String color) {
		this(color,"auto",3);
		this.color = color;
		System.out.println("디스 생성자 호출됌");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song myCar = new Song("Green","manual",4);
		Song mySong = new Song();
		System.out.println(myCar.color);
		System.out.println(myCar.gearType);
		System.out.println(myCar.door);
		mySong.color = "Black";
		mySong.door = 2;
		System.out.println(mySong.color);
		System.out.println(mySong.gearType);
		System.out.println(mySong.door);
		
		Song mySport = new Song("white");
		
		System.out.println(mySport.color);
		System.out.println(mySport.gearType);
		System.out.println(mySport.door);
	}
}

