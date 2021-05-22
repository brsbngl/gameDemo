package entities;

public class Campaign {
	
	private int id;
	private String Name;
	private int price;
	private String inStock;
	
	public Campaign(int id, String Name, int price, String inStock){
		super();
		this.id = id;
		this.Name = Name;
		this.price = price;
		this.inStock = inStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInStock() {
		return inStock;
	}

	public void setInStock(String inStock) {
		this.inStock = inStock;
	}
	
	

}
