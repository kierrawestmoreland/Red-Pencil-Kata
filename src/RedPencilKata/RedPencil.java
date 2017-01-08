package RedPencilKata;

public class RedPencil {

	double originalPrice = 100; // may need constructor for 
	//int newPrice;
	//boolean redPencilSale;
	//int dayOfSale;
	
	public double getOriginalPrice() {
		return originalPrice;
	}

	public boolean isOnSale(double originalPrice, double newPrice) {
		if (newPrice < (originalPrice * .95) && newPrice > (originalPrice * 70)){
		}
		return true;
	}
}
