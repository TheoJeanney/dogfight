package model; //déclaration du package dans lequel se trouve la classe
/**
 * Dimension
 */
public class Dimension {  //création de la classe

    private Integer width;      //création des objects
    private Integer height;

    public Dimension(Integer width, Integer height) {

    }

    public Dimension(Dimension dimension) {
        
    }

    public Integer getWidth() {     //création des acesseurs
        return width;
    }


    public void setWidth(Integer width) {
        this.width = width;
    }


    public Integer getHeight() {
        return height;
    }


    public void setHeight(Integer height) {
        this.height = height;
    }
}