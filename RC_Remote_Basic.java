package main;

public class RC_Remote_Basic implements RC_Remote {

	protected RC_Car car;
	
	RC_Remote_Basic(RC_Car car) {
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
		if(direction.equals("forward"))
			this.car.setDirection(direction);
		else if(direction.equals("backward"))
			this.car.setDirection(direction);
		else
			System.out.println("Invalid direction!");
	}
	
	public void setCar(RC_Car car) {
		this.car = car;
	}
	
	public RC_Car getCar() {
		return this.car;
	}

	@Override
	public void printStatus() {
		System.out.println(
				"Remote type: Basic" + '\n' +
				"Controlled car name: " + this.car.getCarName()
				);

	}

}
