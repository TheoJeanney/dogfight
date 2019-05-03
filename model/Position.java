package dogfight.model; //déclaration du package dans lequel se trouve la classe

/**
 * Position
 */
public class Position { //création de la classe position

    private Double x;       // création des différentes variables
    private Double y;
    private Double maxX;
    private Double maxY;

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
}