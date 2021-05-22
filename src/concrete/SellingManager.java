package concrete;

import entities.Campaign;
import entities.Selling;
import entities.User;

public class SellingManager extends CampaignManager{
	
	public void Sell(User user, Selling game, Campaign campaign) {
		System.out.println("" + user.getFirstName() + " �simli kullan�c� " +  game.getGameName() + " isimindeki oyunu " + campaign.getName() +  " kampanyas� ile % " + campaign.getPrice() + " indirim oran�yla " + game.getGamePriceAferDiscount() + " TL'ye sat�n ald�.");

}
}