package concrete;

import abstracts.CheckUserManager;
import entities.User;

public class UserManager implements CheckUserManager {
	
	public void signUp(User user) {
		System.out.println(user.getFirstName() + "isimli kullanýcý baþarýyla kayýt edildi." );
	}
	public void signIn(User user) {
		System.out.println(user.getFirstName() + "isimli kullanýcý baþarýyla kayýt edildi.");
		
	}
	public void signUpdate(User user) {
		System.out.println(user.getFirstName() + "isimli kullanýcýnýn bilgileri baþarýyla güncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + "isimli kullanýcý baþarýyla silindi.");
	}
	
			
	@Override
	public void CheckIfRealPerson(User user) {
		if(user.getId()==1 && user.getFirstName()=="Baris" && user.getLastName()=="Bingöl" && user.getNationalityId()=="0606" && user.getDayOfBirth()=="19.01.2002")
		{
			System.out.println(user.getFirstName() + "isimli kiþinin doðrulamasý yapýldý.");
		}else
			
		{
			System.out.println(user.getFirstName()+ "isimli kiþi sisteme kayýtlý deðildir.");
		}
		
		
		
	}

}
