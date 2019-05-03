package model; //déclaration du package dans lequel se trouve la classe
import java.awt.color;
/**
 * Mobile
 */
public class Mobile {   //création de la classe mobile

    private Integer speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private Image image;

    /**
     * @return the speed
     */
    public Integer getSpeed() {   //création des accesseurs
        return speed;
    }
    
    public Mobile(Direction direction, Position position, Dimension dimension, Integer speed, String image)
    {
    	
    }
    
    public Direction getDirection()
    {
    	return direction;
    }
    public void setDirection(Direction direction)
    {
    	this.direction = direction;
    }
    
    public Point getPosition()
    {
    	return point;
    }
    
    public Dimension getDimension()
    {
    	return dimension;
    }
    
    
    public Integer getSpeed()
    {
    	return speed;
    }
    
    public Integer getWidth()
    {
    	return width;
    }
    
    
    public Integer getHeight()
    {
    	return height;
    }
     
    public void move()
    {
    	
    }
    
    public void placeInArea(IArea area)
    {
    	
    }
    
    public boolean isPlayer(Integer player)
    {
    	
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
    	return color;
    }
    
    public IDogfightModel getDogfightModel()
    {
    	return dogfightModel ;
    }
    
    public void setDogfightModel(IDogfightModel dogfightModel)
    {
    	
    }
    
    public boolean hit()
    {
    	return hit;
    }
    
    public boolean isWeapon()
    {
    	return weapon;
    }
    
    public Image getImage()
    {
    	return image;
    }
      
}

