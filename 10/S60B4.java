package labb10;

public class S60B4 extends S60 {
	String modelName;
	private int speed1;
	S60B4(int speed){
		modelName= "S60 B4";
		speed1=speed;
		showSpeed(speed);
	}

	
	void engineStart() {
	System.out.println("Engine is started!");
	try {
		Thread.sleep(2000);
	}catch(InterruptedException x) {
		x.printStackTrace();
	}
		System.out.println("Welcome to Volvo " + modelName);
	}

	void showSpeed(int speed) {
		System.out.println("You want to achieve" + speed + "km/h speed");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException x) {
			x.printStackTrace();
		}
		System.out.println("Let's check your speed If It is safe...");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException x) {
			x.printStackTrace();
		}
		System.out.println("Limited Top Speed is: " + topSpeed + " km/h.");
		if(speed<=topSpeed) {
			System.out.println("IT is safe to drive at " + speed + "speed!");
		}else {
			System.out.println("It is not safe to drive at " + speed + "speed!");
		}
	}


	int getSpeed() {
		return speed1;
	}

	
	void setSpeed(int speed1) {
		this.speed1=speed1;
		
	}






}
