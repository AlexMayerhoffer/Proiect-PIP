package main;

public class RC_Remote_Touch extends RC_Remote_Advanced {

	private double sensitivity;
	
	RC_Remote_Touch(RC_Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}


	public double getSensitivity()
	{
		return sensitivity;
	}
	
	public void setSensitivity(double s)
	{
		this.sensitivity = s;
	}
}
