package view;
import java.lang.Runnable;
import java.util.Observable;

import controller.IOrderPerformer;
import model.IDogfightModel;

public class DogfightView implements IViewSystem {
	
	private IOrderPerformer test;
	
	public void DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable)
	{
		this.test=orderPerformer;
	}
	
	private void run()
	{
		
	}
	
	public void displayMessage(String message)
	{
		
	}
	
	public void closeAll()
	{
		
	}
}