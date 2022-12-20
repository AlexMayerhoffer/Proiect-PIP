package main;

public interface RC_Remote {

	
	public void power();
	
	public void drive();
	
	public void direction(String direction);
	
	public void printStatus();
	
	public void setCar(RC_Car car);
	public RC_Car getCar();
	
	
	
}
