package defaultpackage;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
		dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}
	
}
 