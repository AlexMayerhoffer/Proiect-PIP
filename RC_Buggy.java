package main;

public class RC_Buggy implements RC_Car {
	
	
	private String car_name = "";
	private boolean is_driving = false;
	private boolean is_powered = false;
	private String direction = "";
	private String ideal_terrain = "";
	
	RC_Buggy(String name) {
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
	
	public void setIdealTerrain(String ideal_terrain) {
		this.ideal_terrain = ideal_terrain;
	}
	
	public String getIdealTerrain() {
		return this.ideal_terrain;
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
				"Ideal terrain: " + this.ideal_terrain
				);

	}

}
