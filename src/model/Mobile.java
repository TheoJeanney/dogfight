package model; //déclaration du package dans lequel se trouve la classe
import java.awt.Color;
import java.awt.Image;
/**
 * Mobile
 */
public class Mobile {   //création de la classe mobile

    private Integer speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private String image;


    public Mobile(Direction direction, Position position, Dimension dimension, Integer speed, String image)
    {
    	this.direction = direction;
    	this.position = position;
    	this.dimension = dimension;
    	this.speed=speed;
    	this.image = image;
    	
    }
    
      
    public Direction getDirection()
    {
    	return direction;
    }
    public void setDirection(Direction direction)
    {
    	this.direction = direction;
    }
    
    public Position getPosition()
    {
    	return position;
    }
    
    public Dimension getDimension()
    {
    	return dimension;
    }
    
    
    public Integer getSpeed()
    {
    	return 1;
    }
    
    public Integer getWidth()
    {
    	return 1;
    }
    
    
    public Integer getHeight()
    {
    	return 1;
    }
     
    public void move()
    {
    	
    }
    
    public void placeInArea(IArea area)
    {
    	
    }
    
    public boolean isPlayer(Integer player)
    {
<<<<<<< HEAD
    	return true;
=======
    
>>>>>>> branch 'master' of https://github.com/TheoJeanney/dogfight.git
    }
    
    private void moveUp()
    {
    
    }
    
    private void moveRight()
    {
    
    }
    
    private void moveDown()
    {
    	
    }
    
    private void moveLeft()
    {
    	
    }
 
    public Color getColor()
    {
    	return null;
    }
 
    public IDogfightModel getDogfightModel()
    {
<<<<<<< HEAD
    	return null ;
=======
    	return dogfightModel;
>>>>>>> branch 'master' of https://github.com/TheoJeanney/dogfight.git
    }
    
    public void setDogfightModel(IDogfightModel dogfightModel)
    {
  
    }
    
    public boolean hit()
    {
    	return true ;
    }
  
    public boolean isWeapon()
    {
    	return true;
    }
    
    public Image getImage()
    {
    	return null;
    }
      
}


