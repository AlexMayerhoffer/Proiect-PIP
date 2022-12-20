package main;

public class RC_Remote_LongRange extends RC_Remote_Advanced{

	private int distance;

	RC_Remote_LongRange(RC_Car car) {
			super(car);
		}

	public int getDistance() {
		return distance;
	}

	public void setSensitivity(int d) {
		this.distance = d;
	}
	
	

}
