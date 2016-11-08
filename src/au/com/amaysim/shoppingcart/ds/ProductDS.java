package au.com.amaysim.shoppingcart.ds;

import java.math.BigDecimal;

/**
 * This enum would serve as the data source for this project
 * @author wreyes
 *
 */
public enum ProductDS {
	ULT_SMALL("ult_small", "Unlimited 1GB", new BigDecimal("24.90")),
	ULT_MEDIUM("ult_medium", "Unlimited 2GB", new BigDecimal("29.90")),
	ULT_LARGE("ult_large", "Unlimited 5GB", new BigDecimal("44.90")),
	DATA_1_GB("1gb", "1 GB Data-pack", new BigDecimal("9.90"));
	
	private final String product_code;
	private final String product_name;
	private final BigDecimal price;
	
	ProductDS(String product_code, String product_name, BigDecimal price) {
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
	}
	
	public String product_code() { return product_code; }
	public String product_name() { return product_name; }
	public BigDecimal price() { return price; }
}
