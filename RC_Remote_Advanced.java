package main;

public class RC_Remote_Advanced implements RC_Remote {

	RC_Car car;
	
	RC_Remote_Advanced(RC_Car car) {
		this.car = car;
	}
	
	@Override
	public void power() {
		if (this.car.getPowered() == true)
			this.car.setPower(false);
		else
			this.car.setPower(true);
	}

	@Override
	public void drive() {
		if (this.car.getDriving() == true)
			this.car.setDriving(false);
		else
			this.car.setDriving(true);
	}

	@Override
	public void direction(String direction) {
		if(direction.equals("forward") ||
				direction.equals("backwards") ||
				direction.equals("left") || 
				direction.equals("right"))
			this.car.setDirection(direction);
		else
			System.out.println("Invalid direction!");

	}

	@Override
	public void printStatus() {
		System.out.println(
				"Remote type: Advanced" + '\n' +
				"Controlled car name: " + this.car.getCarName()
				);

	}

	@Override
	public void setCar(RC_Car car) {
		this.car = car;
	}

	@Override
	public RC_Car getCar() {
		return this.car;
	}

}
