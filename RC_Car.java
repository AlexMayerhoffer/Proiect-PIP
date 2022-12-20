package main;

public interface RC_Car {
	
	public void setDriving(boolean drive);
	public boolean getDriving();

	
	public void setPower(boolean power);
	public boolean getPowered();
	
	
	public void setDirection(String direction);
	public String getDirection();
	
	public void setCarName(String name);
	public String getCarName();
	
	public void printStatus();
}
