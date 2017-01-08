package RedPencilKata;

public class RedPencil {

	double originalPrice; // may need constructor for 
	double newPrice;
	int dayOfSale;
	
	
	public RedPencil(double originalPrice, double newPrice) {
		this.originalPrice = originalPrice;
		this.newPrice = newPrice;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}
	
	public boolean isOnSale() {
		if (newPrice < (originalPrice * .95) && newPrice > (originalPrice * 70)){
		}
		return true;
	}

	public boolean isOnSale(int daysOfSale) {
		return false;
	}
}
