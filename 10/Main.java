package labb10;

public class Main {

	public static void main(String[] args) {
		 S60B4 d1 = new S60B4(290);
		 d1.engineStart();
		 d1.adaptiveCruiseControlSpeed(22);
		 System.out.println("---------------New Entrance-------------");
		 S60D2 d2 = new S60D2(290);
		 d2.engineStart();
		 d2.adaptiveCruiseControlSpeed(50);
		 System.out.println("---------------New Entrance-------------");
		 S60B4 d3= new S60B4(39);
		 d3.engineStart();
		 d3.adaptiveCruiseControlSpeed(0);
		 System.out.println("---------------New Entrance-------------");
		 S60B4 d4= new S60B4(290);
		 d4.engineStart();
		 d4.adaptiveCruiseControlSpeed(170);

	}

}
