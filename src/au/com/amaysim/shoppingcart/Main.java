package au.com.amaysim.shoppingcart;

import java.util.Scanner;

import au.com.amaysim.shoppingcart.ds.ProductDS;
import au.com.amaysim.shoppingcart.model.IHeartAmaysimPromo;
import au.com.amaysim.shoppingcart.model.Product;
import au.com.amaysim.shoppingcart.model.ShoppingCart;
import au.com.amaysim.shoppingcart.model.Unli1GBPromo;
import au.com.amaysim.shoppingcart.model.Unli2GBPromo;
import au.com.amaysim.shoppingcart.model.Unli5GBPromo;

public class Main {


	public static void main(String[] args) {
		System.out.println("Hello Welcome to the Amaysim ShoppingCart Application!");

		System.out.println("SCENARIO ONE");
		ShoppingCart scenarioOne = new ShoppingCart(new Unli1GBPromo());
		scenarioOne.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioOne.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioOne.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioOne.addItem(new Product(ProductDS.ULT_LARGE));
		scenarioOne = scenarioOne.checkout();
		System.out.println("Expected cart total: " + scenarioOne.getTotalCheckoutPrice());
		System.out.println("Expected cart items:");
		for (Product product : scenarioOne.getItems()) {
			System.out.println(product.getProductName());
		}

		System.out.println("SCENARIO TWO");
		ShoppingCart scenarioTwo = new ShoppingCart(new Unli5GBPromo());
		scenarioTwo.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioTwo.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioTwo.addItem(new Product(ProductDS.ULT_LARGE));
		scenarioTwo.addItem(new Product(ProductDS.ULT_LARGE));
		scenarioTwo.addItem(new Product(ProductDS.ULT_LARGE));
		scenarioTwo.addItem(new Product(ProductDS.ULT_LARGE));
		scenarioTwo = scenarioTwo.checkout();
		System.out.println("Expected cart total: " + scenarioTwo.getTotalCheckoutPrice());
		System.out.println("Expected cart items:");
		for (Product product : scenarioTwo.getItems()) {
			System.out.println(product.getProductName());
		}

		System.out.println("SCENARIO THREE");
		ShoppingCart scenarioThree = new ShoppingCart(new Unli2GBPromo());
		scenarioThree.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioThree.addItem(new Product(ProductDS.ULT_MEDIUM));
		scenarioThree.addItem(new Product(ProductDS.ULT_MEDIUM));
		scenarioThree = scenarioThree.checkout();
		System.out.println("Expected cart total: " + scenarioThree.getTotalCheckoutPrice());
		System.out.println("Expected cart items:");
		for (Product product : scenarioThree.getItems()) {
			System.out.println(product.getProductName());
		}

		System.out.println("SCENARIO FOUR");
		ShoppingCart scenarioFour = new ShoppingCart(new Unli2GBPromo());
		scenarioFour.addItem(new Product(ProductDS.ULT_SMALL));
		scenarioFour.addItem(new Product(ProductDS.DATA_1_GB), new IHeartAmaysimPromo());
		scenarioFour = scenarioFour.checkout();
		System.out.println("Expected cart total: " + scenarioFour.getTotalCheckoutPrice());
		System.out.println("Expected cart items:");
		for (Product product : scenarioFour.getItems()) {
			System.out.println(product.getProductName());
		}

	}

}
