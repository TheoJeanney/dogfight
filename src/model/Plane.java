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
	
		this.player=player;
		
	}
	
	public boolean isPlayer(Integer player)
	{
		return ;
	}

    public boolean hit()
    {
    	return ;
    }
}