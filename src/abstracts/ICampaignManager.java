package abstracts;
 
import entities.Campaign;

public interface ICampaignManager {
	void CampaignAdd(Campaign campaign);
	
	void CampaignDelete(Campaign campaign);
	
	void CampaignUpdate(Campaign campaign);
	

}
