package java.com.kata;

public class Checkout {
	public Integer getTotalPriceByItemAndQuantity(String product, int Quantity, int price) {

		Integer productPrice = 0;
		if (product.equals("A") || product.equals("B")) {
			return productPrice = Quantity * price;
		}

		return productPrice;
	}

}
