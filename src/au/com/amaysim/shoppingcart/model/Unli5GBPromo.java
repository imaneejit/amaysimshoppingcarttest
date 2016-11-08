package au.com.amaysim.shoppingcart.model;

import java.math.BigDecimal;
import java.util.List;

import au.com.amaysim.shoppingcart.ds.ProductDS;

public class Unli5GBPromo implements PromoTypes {

	private final BigDecimal newPrice = new BigDecimal("39.90");
	@Override
	public ShoppingCart applyPromo(List<Product> productList) {
		ShoppingCart retVal = new ShoppingCart(this);
		BigDecimal runningTotal = new BigDecimal("0");
		
		for (Product product : productList) {
			if (product.getProductCode().equals(ProductDS.ULT_LARGE.product_code())) {
				runningTotal = runningTotal.add(newPrice);
			} else {
				runningTotal = runningTotal.add(product.getProductPrice());
			}
			retVal.addItem(product);
		}
		retVal.setTotalCheckoutPrice(runningTotal);
		return retVal;
	}

//	@Override
//	public boolean verifyPromo(ShoppingCart cart) {
//		boolean retVal = false;
//		if (cart.getPromo() instanceof Unli5GBDiscountPromoStrategy) {
//			retVal = true;
//		}
//		int unli5GBCount = 0;
//		for (Product product : cart.getItems()) {
//			if (product.getProductCode().equals(ProductDS.ULT_LARGE.product_code())) {
//				unli5GBCount++;
//			}
//		}
//		retVal = (unli5GBCount>3);
//		return retVal;
//	}

}
