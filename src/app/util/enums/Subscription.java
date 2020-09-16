package app.util.enums;

public enum Subscription {
	
	FREE(0), PREMIUM(5), PREMIUMEXTRA(8), FAMILY(6);
	
	public double value;
	
	private Subscription(double value) {
		this.value = value;
	}
}
