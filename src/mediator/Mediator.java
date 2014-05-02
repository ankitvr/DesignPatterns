package mediator;

public interface Mediator {

	public void saleOffer(String stock, int shares);

	public void buyOffer(String stock, int shares);
	
	public void addColleague(Colleague colleague);
	
}
