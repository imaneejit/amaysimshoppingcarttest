package au.com.amaysim.shoppingcart.model;

import java.math.BigDecimal;
import java.util.List;

public class IHeartAmaysimPromo implements PromoCode {
	
	private final String PROMO_CODE = "I<3AMAYSIM";
	private  BigDecimal DISCOUNT = new BigDecimal("0.10");

	@Override
	public ShoppingCart applyPromo(List<Product> productList) {
		ShoppingCart retVal = new ShoppingCart(this);
		BigDecimal runningTotal = new BigDecimal("0");
		for (Product product : productList) {
			runningTotal = runningTotal.add(product.getProductPrice());
			retVal.addItem(product);
		}
		BigDecimal priceOff = runningTotal.multiply(DISCOUNT);
		
		runningTotal = runningTotal.subtract(priceOff);
		retVal.setTotalCheckoutPrice(runningTotal);
		return retVal;
	}

	@Override
	public String getPromoCode() {
		// TODO Auto-generated method stub
		return PROMO_CODE;
	}

}
