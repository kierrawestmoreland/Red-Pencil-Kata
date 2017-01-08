package RedPencilKata;

public class RedPencil {

	double originalPrice; 
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
		if (newPrice < (originalPrice * .95) && newPrice > (originalPrice * .70)){
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isOnSale(int daysOfSale) {
		if(daysOfSale < 31){
			return true;
		}
		else{
			return false;
		}
	}
}
