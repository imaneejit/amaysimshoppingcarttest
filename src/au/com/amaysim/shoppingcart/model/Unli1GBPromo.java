package au.com.amaysim.shoppingcart.model;

import java.math.BigDecimal;
import java.util.List;

import au.com.amaysim.shoppingcart.ds.ProductDS;

public class Unli1GBPromo implements PromoTypes {

	@Override
	public ShoppingCart applyPromo(List<Product> productList) {
		ShoppingCart retVal = new ShoppingCart(this);
		BigDecimal runningTotal = new BigDecimal("0");
		int ult1GBcount = 0;
		for (Product product : productList) {
			if (product.getProductCode().equals(ProductDS.ULT_SMALL.product_code())) {
				ult1GBcount++;
			} else {
				runningTotal = runningTotal.add(product.getProductPrice());
			}
			retVal.addItem(product);
		}	
		BigDecimal multiplier = new BigDecimal((ult1GBcount/3 * 2) + ult1GBcount%3);
		BigDecimal newPromoPrice = ProductDS.ULT_SMALL.price().multiply(multiplier);
		retVal.setTotalCheckoutPrice(newPromoPrice.add(runningTotal));
		return retVal;
	}

}
