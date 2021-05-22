package concrete;

import entities.Campaign;
import entities.Selling;
import entities.User;

public class SellingManager extends CampaignManager{
	
	public void Sell(User user, Selling game, Campaign campaign) {
		System.out.println("" + user.getFirstName() + " Ýsimli kullanýcý " +  game.getGameName() + " isimindeki oyunu " + campaign.getName() +  " kampanyasý ile % " + campaign.getPrice() + " indirim oranýyla " + game.getGamePriceAferDiscount() + " TL'ye satýn aldý.");

}
}