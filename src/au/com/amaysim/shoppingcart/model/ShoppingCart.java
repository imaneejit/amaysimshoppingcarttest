package au.com.amaysim.shoppingcart.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
	private List<Product> productItems = new ArrayList<Product>();
	private BigDecimal totalCheckoutPrice;
	private PromoTypes promo;
	private PromoCode promoCode;

	public ShoppingCart(PromoTypes promo) {
		this.promo = promo;
	}

	public PromoTypes getPromo() {
		return promo;
	}

	public List<Product> getItems() {
		return productItems;
	}

	public BigDecimal getTotalCheckoutPrice() {
		return totalCheckoutPrice;
	}

	public void setTotalCheckoutPrice(BigDecimal totalCheckoutPrice) {
		this.totalCheckoutPrice = totalCheckoutPrice;
	}

	public void addItem(Product product) {

		this.productItems.add(product);
	}

	/**
	 * Add a new product item
	 * 
	 * @param product
	 * @param promos
	 */
	public void addItem(Product product, PromoCode promoCode) {
		this.productItems.add(product);
		this.promoCode = promoCode;
	}

	/**
	 * Checkout and apply the promos of this ShoppingCart.
	 * 
	 * @return
	 */
	public ShoppingCart checkout() {
		//
		ShoppingCart checkoutCart = new ShoppingCart(this.getPromo());
		checkoutCart = promo.applyPromo(this.getItems());
		if (this.promoCode!=null) {
			checkoutCart = promoCode.applyPromo(this.getItems());
		}
		return checkoutCart;
	}
}
