package test.com.kata;

import static org.junit.Assert.*;

import java.com.kata.Checkout;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class CheckoutTestShould extends TestCase {

	@Test
	public void return_amount_50_for_productA() {

		Checkout checkoutCalculator = new Checkout();
		String productName = "A";
		List<String> listOfItemCode = Arrays.asList(productName);
		assertEquals(50, checkoutCalculator.calculateAllItems(listOfItemCode, productName));

	}

	@Test
	public void return_amount_30_for_productB() {

		Checkout checkoutCalculator = new Checkout();
		String productName = "B";
		List<String> listOfItemCode = Arrays.asList(productName);
		assertEquals(30, checkoutCalculator.calculateAllItems(listOfItemCode, productName));

	}

	@Test
	public void return_amount_70_for_productC() {

		String productName = "C";
		Checkout checkoutCalculator = new Checkout();
		List<String> listOfItemCode = Arrays.asList(productName);
		assertEquals(70, checkoutCalculator.calculateAllItems(listOfItemCode, productName));

	}

}
