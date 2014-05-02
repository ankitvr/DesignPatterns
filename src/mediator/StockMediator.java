package mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

	private ArrayList<Colleague> colleagues;
	private ArrayList<StockOffer> stockBuyOffers;
	private ArrayList<StockOffer> stockSellOffers;
	
	private int colleagueCode = 0;
	public StockMediator() {

		colleagues = new ArrayList<Colleague>();
		stockBuyOffers = new ArrayList<StockOffer>();
		stockSellOffers = new ArrayList<StockOffer>();
		
	}

	@Override
	public void saleOffer(String stock, int shares) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buyOffer(String stock, int shares) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addColleague(Colleague colleague) {
		// TODO Auto-generated method stub

	}

}
