package gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics, ImageObserver Observer);
	public int getGlobalWidth();
	public int getGlobalHeight();
}