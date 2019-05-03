package model; //d�claration du package dans lequel se trouve la classe

import java.util.ArrayList;

/**
 * IDogfightModel
 */

public interface IDogfightModel {   //création de l'interface IDogfightModel
	public IArea getArea();
	public void buildArea(Dimension dimension);
	public void addMobile(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public ArrayList<IMobile> getMobiles();
	public IMobile getMobileByPlayer(int player);
	public void setMobilesHavesMoved();
}

