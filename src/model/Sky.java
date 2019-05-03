package model; //déclaration du package dans lequel se trouve la classe

import java.awt.Image;

/**
 * Sky
 */
public class Sky implements IArea {  //création de la classe Sky

	Dimension dimension = new Dimension();
	
    public Sky(Dimension dimension)
    {
    	this.dimension = dimension;
    }
    
    public Dimension getDimension(){
 
    return dimension;
    }
    
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
