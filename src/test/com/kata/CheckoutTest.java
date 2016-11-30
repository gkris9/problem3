package test.com.kata;

import static org.junit.Assert.*;

import java.com.kata.Checkout;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class CheckoutTest extends TestCase {
	@Test
	public void price_of_zero_item() {

		Checkout checkoutItem = new Checkout();
		assertEquals(checkoutItem.getTotalPriceByItemAndQuantity(" ", 1, 50), 0);
	}
	
	@Test
	public void price_of_one_item_one_Quantity() {

		Checkout checkoutItem = new Checkout();
		assertEquals(checkoutItem.getTotalPriceByItemAndQuantity("A", 1, 50), 50);
	}
	
	@Test
	public void price_of_one_item_two_Quantity() {

		Checkout checkoutItem = new Checkout();
		assertEquals(checkoutItem.getTotalPriceByItemAndQuantity("B", 2, 30), 60);
	}
}
