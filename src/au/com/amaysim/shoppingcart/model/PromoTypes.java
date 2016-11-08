package au.com.amaysim.shoppingcart.model;

import java.util.List;

public interface PromoTypes {
	
	/**
	 * Apply this promo 
	 * 
	 * @param cart
	 * @return
	 */
	public ShoppingCart applyPromo(List<Product> productList);
}
