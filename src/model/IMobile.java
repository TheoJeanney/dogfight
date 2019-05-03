package model; //déclaration du package dans lequel se trouve la classe

import java.awt.*;
import model.Direction;

public interface IMobile {  //création de l'interface IMobile
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Point getPosition();
	public Dimension getDimension();
    public int getWidth();
    public int getHeight();
    public int getSpeed();
    public Image getImage();
    public void move();
    public void placeInArea(IArea area);
    public boolean isPlayer(int Player);
    public void setDogfightModel(DogfightModel dogfightModel);
    public boolean hit();
    public boolean isWeapon();
}