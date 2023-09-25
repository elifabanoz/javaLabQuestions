package labb10;

public abstract class S60 {
	final int topSpeed = 180;
	abstract void engineStart();
	abstract void showSpeed(int speed);
	public void adaptiveCruiseControlSpeed(int frontSpeed) {
		if(frontSpeed<=0 || frontSpeed >topSpeed) {
			System.out.println("Adaptive Cruise Control is not available.");
			return;
		}
		System.out.println("Adaptive Cruise Control is active.");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException x) {
			x.printStackTrace();
		}
		System.out.println("The front car speed is " +frontSpeed);
		int distance=37;
		if(getSpeed()>40) {
			if(getSpeed()>topSpeed) {
				setSpeed(topSpeed);
			}
			if(distance<20 && getSpeed()<frontSpeed) {
				System.out.println("The distance: " + distance + ". Emergency Braking is applying!");
			}else if(frontSpeed<getSpeed() && distance>=20) {
				System.out.println("The distance: " + distance + ". Car is slowing...");
			}else {
				System.out.println("Adaptive Cruise is secure and active...");
			}
		}else {
			System.out.println("Adaptive Cruise Control is not avaliable.");
		}
	}
	abstract int getSpeed();
	abstract void setSpeed(int speed1);
	


}
