package model; //déclaration du package dans lequel se trouve la classe
/**
 * Plane
 */
public class Plane extends Mobile {

	
	private static Integer SPEED=2;
	private static Integer WIDTH=100;
	private static Integer HEIGHT=30;
	private Integer player;
	
	 
	public Plane(Integer player,Direction direction, Position position, String image) {
	
		super(direction,position,new Dimension(WIDTH, HEIGHT),SPEED, image);
		
	}
	
	public boolean isPlayer(Integer player)
	{
		return true ;
	}

    public boolean hit()
    {
    	return true ;
    }
}