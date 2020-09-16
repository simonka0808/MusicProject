package app.model;

public class Subscription {
	
	private String name;
	private double price;
	
	  public Subscription(String name) {
		this.setName(name);		
	  }	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		for(app.util.enums.Subscription s : app.util.enums.Subscription.values()) {
			if(name.equalsIgnoreCase(s.name())) {
				this.name = name;
				this.setPrice(s.value);
				break;
			}		
		}
		if(this.name == null) {
			this.name = name;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
