package main;

public class RC_Race_Car implements RC_Car {
	
	

	private String car_name = "";
	private boolean is_driving = false;
	private boolean is_powered = false;
	private String direction = "";
	private int hp = 0;
	
	RC_Race_Car(String name) {
		this.car_name = name;
	}

	@Override
	public boolean getDriving() {
		return is_driving;
	}

	@Override
	public void setDriving(boolean drive) {
		this.is_driving = drive;

	}

	@Override
	public void setPower(boolean power) {
		 this.is_powered = power;

	}

	@Override
	public boolean getPowered() {
		return this.is_powered;
	}

	@Override
	public void setDirection(String direction) {
		this.direction = direction;

	}

	@Override
	public String getDirection() {
		return this.direction;
	}
	
	public void setHorsePower(int hp) {
		this.hp = hp;
	}
	
	public int getHorsePower() {
		return this.hp;
	}
	
	public void setCarName(String name) {
		this.car_name = name;
	}
	
	public String getCarName() {
		return this.car_name;
	}

	@Override
	public void printStatus() {
		System.out.println(
				"Car name: " + this.car_name + '\n' +
				"Is powered: " + this.is_powered + '\n' +
				"Is driving: " + this.is_driving + '\n' +
				"Direction: " + this.direction + '\n' +
				"Horse Power: " + this.hp
				);

	}

}
