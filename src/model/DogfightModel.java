package model; //déclaration du package dans lequel se trouve la classe

import java.util.ArrayList;
import java.util.Observable; //on importe la java.util.Observable afin de pouvoir l'utiliser au sein de cette classe

/**
 * DogfightModel
 */
public class DogfightModel extends Observable {    //création de la classe DogfightModel
	public DogfightModel() {
		
	}
	
	public IArea getArea() {
		return null;
	}

	public void buildArea(Dimension dimension) {
		
	}
	
	public void addMobile(IMobile Mobile) {
		
	}
	
	public void removeMobile(IMobile Mobile) {
		
	}
	
	public ArrayList<IMobile> getMobiles() {
		return null;
	}
	
	public IMobile getMobileByPlayer(int player) {
		return null;
	}
}