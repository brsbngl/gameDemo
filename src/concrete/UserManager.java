package concrete;

import abstracts.CheckUserManager;
import entities.User;

public class UserManager implements CheckUserManager {
	
	public void signUp(User user) {
		System.out.println(user.getFirstName() + "isimli kullan�c� ba�ar�yla kay�t edildi." );
	}
	public void signIn(User user) {
		System.out.println(user.getFirstName() + "isimli kullan�c� ba�ar�yla kay�t edildi.");
		
	}
	public void signUpdate(User user) {
		System.out.println(user.getFirstName() + "isimli kullan�c�n�n bilgileri ba�ar�yla g�ncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + "isimli kullan�c� ba�ar�yla silindi.");
	}
	
			
	@Override
	public void CheckIfRealPerson(User user) {
		if(user.getId()==1 && user.getFirstName()=="Baris" && user.getLastName()=="Bing�l" && user.getNationalityId()=="0606" && user.getDayOfBirth()=="19.01.2002")
		{
			System.out.println(user.getFirstName() + "isimli ki�inin do�rulamas� yap�ld�.");
		}else
			
		{
			System.out.println(user.getFirstName()+ "isimli ki�i sisteme kay�tl� de�ildir.");
		}
		
		
		
	}

}
