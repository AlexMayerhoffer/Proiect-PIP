package main;

public class Start {

	public static void main(String[] args) {
		RC_Buggy car1 = new RC_Buggy("Masina1");
		car1.setIdealTerrain("desert");
		
		RC_Remote_Basic remote1 = new RC_Remote_Basic(car1);
		remote1.power();
		
		remote1.printStatus();
		
		car1.printStatus();
		
		RC_Buggy car2 = new RC_Buggy("Masina2");
		
		remote1.setCar(car2);
		
		remote1.printStatus();

	}

}
