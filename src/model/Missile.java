package model; // //déclaration du package dans lequel se trouve la classe
/**
 * Missile
 */
public class Missile extends Mobile { //création de la classe Missile comme héritant de la classe mobile

    private static Integer SPEED  = 4;
    private static Integer WIDTH  = 30;
    private static Integer HEIGHT  = 10;
    private static Integer MAX_DISTANCE_TRAVELED = 1400;
    private static String IMAGE = "missile";
    private Integer distanceTravaled = 0;
 
    public Missile(Direction direction, Position position) {
        super(direction,position, new Dimension(WIDTH, HEIGHT),SPEED,IMAGE);
    }

    public static Integer getWidthWithADirection(Direction direction) {
    	return 1;
    }

    public static Integer getHeightWithADirection(Direction direction) {
    	return 1;
    }

    public void move() {
        
    }

    public boolean isWeapon() {
        return true;
    }
}