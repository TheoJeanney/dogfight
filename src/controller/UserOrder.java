package controller;

public class UserOrder implements IUserOrder {

	private Integer player;
	private Order order;
	
	public UserOrder(int player, Order order )
	{

		this.player = player;
		this.order=order;
	
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return order ;
	}

	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return player;
	}
}