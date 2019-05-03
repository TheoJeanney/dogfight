package controller;

import model.IDogfightModel;
import model.Missile;
import view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private static Integer TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	Missile missile = new Missile();
	
	public DogfightController(IDogfightModel dogfightModel)
	{
	 this.dogfightModel = dogfightModel;
	 
	}
	
	public void orderPerform(UserOrder userOder)
	{
		
	}
	
	//Jeu
	public void play()
	{
	
	} 
	
	public void setViewSystem(IViewSystem viewSystem)
	{
		this.viewSystem = viewSystem;
	}
	
	//Lancement missile
	private void launchMissile(Integer player)
	{
		
	}

	private void gameLoop()
	{
		
	}
}
