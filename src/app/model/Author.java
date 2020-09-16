package app.model;

public class Author {

	private String name;
	private String country;
	private int rating;
	
	public Author(String name, String country, int rating) {
		this.name = name;
		this.country = country;
		this.rating = rating;
		
		
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name: %s", this.getName()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Country: %s", this.getCountry()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Rating: %d", this.getRating()));
		
		
		return sb.toString();
	}
}
