package entities;

public class Selling {
	private String gameName;
	private int gamePrice;
	private int gameStock;
	private int gameDiscount;
	private int gamePriceAferDiscount;
	
	public Selling() {
		
	}
	
	public Selling(String gameName, int gamePrice, int gameStock, int gameDiscount, int gamePriceAfterDiscount) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameStock = gameStock;
		this.gameDiscount = gameDiscount;
		this.gamePriceAferDiscount = gamePriceAfterDiscount;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getGameStock() {
		return gameStock;
	}

	public void setGameStock(int gameStock) {
		this.gameStock = gameStock;
	}

	public int getGameDiscount() {
		return gameDiscount;
	}

	public void setGameDiscount(int gameDiscount) {
		this.gameDiscount = gameDiscount;
	}

	public int getGamePriceAferDiscount() {
		return gamePriceAferDiscount;
	}

	public void setGamePriceAferDiscount(int gamePriceAferDiscount) {
		this.gamePriceAferDiscount = gamePriceAferDiscount;
	}
	
	
	
	
	
	
	
	
	
	
}

	


