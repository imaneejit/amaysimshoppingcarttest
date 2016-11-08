package au.com.amaysim.shoppingcart.model;

import java.math.BigDecimal;
import java.util.List;

import au.com.amaysim.shoppingcart.ds.ProductDS;

public class Unli2GBPromo implements PromoTypes {

	@Override
	public ShoppingCart applyPromo(List<Product> productList) {
		ShoppingCart retVal = new ShoppingCart(this);
		BigDecimal runningTotal = new BigDecimal("0");
		for (Product product : productList) {
			runningTotal = runningTotal.add(product.getProductPrice());
			if (product.getProductCode().equals(ProductDS.ULT_MEDIUM.product_code())) {
				retVal.addItem(new Product(ProductDS.DATA_1_GB));
			}
			retVal.addItem(product);
		}
		retVal.setTotalCheckoutPrice(runningTotal);
		return retVal;
	}
}
