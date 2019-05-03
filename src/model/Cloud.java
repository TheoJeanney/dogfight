package model; //déclaration du package dans lequel se trouve la classe
/**
 * Cloud
 * @param <speed>
 */
public class Cloud extends Mobile{  //création de la classe Cloud comme héritant de la classe Mobile

    private static Integer SPEED = 1;
    private static Integer WIDTH = 300;
    private static Integer HEIGHT = 150;
    private static String IMAGE = "cloud";
    
    public Cloud(Direction direction, Position position)
    {
    	super(direction,position, new Dimension(WIDTH, HEIGHT),SPEED,IMAGE );
    }
} 