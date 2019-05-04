package controller;

import model.*;
import view.*;

public class DogfightController implements IOrderPerformer {

	private static Integer TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private DogfightModel dogfightModel;

	
	public DogfightController(DogfightModel dogfightModel)
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
