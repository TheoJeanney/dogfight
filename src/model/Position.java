package model; //déclaration du package dans lequel se trouve la classe

/**
 * Position
 */
public class Position { //création de la classe position

    private Double x;       // création des différentes variables
    private Double y;
    private Double maxX;
    private Double maxY;

    public Position(Double x, Double y, Double maxX, Double maxY) { //Création du constructeur Position
        
    }

    public Position(Position position) {
        
    }

    /**
     * @return the x
     */
    public Double getX() {      //création des accesseurs
        return x;
    }

    /**
     * @param x the y to set
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Double y) {
        this.y = y;
    }

    /**
     * @param maxX the maxX to set
     */
    public void setMaxX(Double maxX) {
        this.maxX = maxX;
    }

    /**
     * @param maxY the maxY to set
     */
    public void setMaxY(Double maxY) {
        this.maxY = maxY;
    }
}