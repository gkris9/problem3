package java.com.kata;

import java.util.HashMap;
import java.util.List;

public class Checkout {

	private HashMap<String, Integer> productPrice = new HashMap<String, Integer>();

	public Checkout() {
		productPrice.put("A", 50);
		productPrice.put("B", 30);
		productPrice.put("C", 70);
	}

	public int getProduct(String productName) {
		return productPrice.get(productName);
	}

	public int calculateAllItems(List<String> productTotalPrice, String productName) {
		int totalPrice = 0;
		for (String product : productTotalPrice) {
			totalPrice += getProduct(product);

		}

		int productCount = 0;
		for (String product : productTotalPrice) {
			if (product.equals(productName)) {
				productCount++;
			}
			if (productCount == 1) {
				totalPrice = (getProduct(productName));
			}
			if (productCount >= 2) {
				totalPrice = totalPrice + ((getProduct(productName) * productCount) - (10 * productCount));
			}
		}

		return totalPrice;
	}

}
