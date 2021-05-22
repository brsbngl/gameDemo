package gameDemo;

import concrete.CampaignManager;
import concrete.SellingManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Selling;
import entities.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------Kullanici Kayit----------------------------");
		User user1 = new User(1," Baris ","Bingöl","0606","19.01.2002");
		User user2 = new User(2," Dilara ","Yildiz","123479","30.03.2004");
		UserManager userManager = new UserManager();
		userManager.signUp(user1);
		userManager.signIn(user2);
		
		System.out.println("---------------------------------------------");
		UserManager userManager2 = new UserManager();
		userManager2.CheckIfRealPerson(user1);
		userManager2.CheckIfRealPerson(user2);
		
		System.out.println(" ");
		System.out.println("---------------------Bilgi Güncelleme-----------------------------");
		
		userManager.signUpdate(user1);
		userManager.signUpdate(user2);
		userManager.delete(user1);
		userManager.delete(user2);
	
		
		
		Selling game = new Selling("Cyberpunk" , 100 , 1000 , 15 , 85);
		SellingManager sellingManager = new SellingManager();
		
		System.out.println(" ");		
	
		Campaign campaign = new Campaign(1, "yaz indirimi", 12, "Evet");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.CampaignAdd(campaign);
		campaignManager.CampaignDelete(campaign);
		campaignManager.CampaignUpdate(campaign);
		
		System.out.println(" ");
		
		System.out.println("------------------------Satis--------------------------");
		
		sellingManager.Sell(user1, game,campaign);

	}


	}


